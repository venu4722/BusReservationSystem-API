
# BusReservationSystem-API

   --Tech Stack----
------------------------------------------
**  Java
**  Spring Framework
**  Spring Boot
**  Spring Data JPA
**  Hibernate
**  MySQL

---------------------------------------------

  <--Modules-->
-----------------------------------------
**  Login, Logout Module
**  Admin Module
**  User Module
**  Route Module
**  Bus Module
**  Reservation Module
**  Feedback Module
-------------------------------------

   --Features--
-------------------------------------
* User and Admin authentication & validation with session uuid.
* Admin Features:
* Administrator Role of the entire application
* Only registered admins with valid session token can add/update/delete route and bus from main database
* Admin can access the details of different users and reservations.
* User Features:
* Registering themselves with application, and logging in to get the valid session token
* Viewing list of available buses and booking a reservation
* Only logged in user can access his reservations, profile updation and other features.
-------------------------------------------------------------------------------------------------

  --Installation & Run--
----------------------------------------------
Before running the API server, you should update the database config inside the application.properties file.
Update the port number, username and password as per your local database config.
-------------------------------------------------------------------------------------

  server.port=8888 //Not mandatory it will run in default port :8080

  spring.datasource.url=jdbc:mysql://localhost:3306/ibusdb
  spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
  spring.datasource.username=your database username
  spring.datasource.password=ypur database password
  ---------------------------------------------------------------------

  ----------------------------API Root Endpoint-----------------------
  https://localhost:8888/    //if you mention port number otherwise it will be 8080

  http://localhost:8888/swagger-ui/    //we are using swagger as an UI to get the resquest and response

  -------------------------------------------------------

  -------------------API Module Endpoints--------------------------------

Login Module
POST //login/admin : Admin can login with mobile number and password provided at the time of registation


Sample API Response for Admin Login

POST   localhost:8888/login/admin

Sample Request Body
    {
        "mobileNo": "8891067909",
        "password": "Moarpllme@007"
    }

    
Sample Response Body
   CurrentAdminSession( adminId=1, uuid=uUcWXg,localDatetime=2022-11-11 12:29:52.376508)

   Thank you...........♥♥

