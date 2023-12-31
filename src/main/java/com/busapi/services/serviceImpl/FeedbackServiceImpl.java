package com.busapi.services.serviceImpl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.busapi.exceptions.BusException;
import com.busapi.exceptions.FeedBackException;
import com.busapi.exceptions.UserException;
import com.busapi.models.Bus;
import com.busapi.models.CurrentUserSession;
import com.busapi.models.Feedback;
import com.busapi.models.User;
import com.busapi.repository.BusDao;
import com.busapi.repository.UserDao;
import com.busapi.repository.UserSessionDao;
import com.busapi.repository.feedbackDao;
import com.busapi.services.FeedbackService;

@Service
public class FeedbackServiceImpl implements FeedbackService {

	@Autowired
	private feedbackDao fdao;

	@Autowired
	private UserDao userDao;

	@Autowired
	private BusDao busDao;
	
	@Autowired
	private UserSessionDao userSessionDao;

	@Override
	public Feedback addFeedBack(Feedback feedBack, Integer busId,String key) throws BusException, UserException {
		
		CurrentUserSession loggedInUser= userSessionDao.findByUuid(key);
		
		if(loggedInUser == null) {
			throw new UserException("Please provide a valid key to give Feedback!");
		}
		
		User user = userDao.findById(loggedInUser.getUserId()).orElseThrow(()-> new UserException("User not found!"));
		
		Optional<Bus> busOptional = busDao.findById(busId);
		if (busOptional.isEmpty()) {

			throw new BusException("Bus is not present with Id: "+ busId);
		}


		feedBack.setBus(busOptional.get());
		feedBack.setUser(user);
		feedBack.setFeedbackDateTime(LocalDateTime.now());
		Feedback savedFeedback = fdao.save(feedBack);

		return savedFeedback;
	}

	@Override
	public Feedback updateFeedBack(Feedback feedback,String key) throws FeedBackException, UserException {
		
		CurrentUserSession loggedInUser= userSessionDao.findByUuid(key);
		
		if(loggedInUser == null) {
			throw new UserException("Please provide a valid key to update Feedback!");
		}
		
		User user = userDao.findById(loggedInUser.getUserId()).orElseThrow(()-> new UserException("User not found!"));

		Optional<Feedback> opt = fdao.findById(feedback.getFeedBackId());
		
		if (opt.isPresent()) {
			
			
			Feedback feedback2 = opt.get();
			
			Optional<Bus> busOptional = busDao.findById(feedback2.getBus().getBusId());
			
			if(!busOptional.isPresent()) throw new FeedBackException("Invalid bus details!");
			
			feedback.setBus(busOptional.get());
			
			
			feedback.setUser(user);

			feedback.setFeedbackDateTime(LocalDateTime.now());

			return fdao.save(feedback);

		}

		throw new FeedBackException("No feedback found!");
	}

	@Override
	public Feedback viewFeedback(Integer id) throws FeedBackException {
		Optional<Feedback> fedOptional = fdao.findById(id);
		if (fedOptional.isPresent()) {

			return fedOptional.get();

		}
		throw new FeedBackException("No feedback found!");
	}

	@Override
	public List<Feedback> viewFeedbackAll() throws FeedBackException {
		Optional<List<Feedback>> fedOptional = Optional.of(fdao.findAll());
		if (fedOptional.isPresent()) {

			return fedOptional.get();

		}
		throw new FeedBackException("No feedbacks found!");
	}

	@Override
	public Feedback deleteFeedBack(Integer feedbackId, String key) throws FeedBackException, UserException {
		
		CurrentUserSession loggedInUser= userSessionDao.findByUuid(key);
		
		if(loggedInUser == null) {
			throw new UserException("Please provide a valid key to update Feedback!");
		}
		
		User user = userDao.findById(loggedInUser.getUserId()).orElseThrow(()-> new UserException("User not found!"));
		
		Optional<Feedback> fedOptional = fdao.findById(feedbackId);
		
		if (fedOptional.isPresent()) {

			Feedback existingFeedback = fedOptional.get();
			
			fdao.delete(existingFeedback);
			
			return existingFeedback;

		}
		throw new FeedBackException("No feedback found!");
	}

}
