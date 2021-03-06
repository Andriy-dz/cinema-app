# Cinema app 
## This is a web-app with a huge helpful functionality
To use the program you need to register or log in
With this program, the administrator can create movies, cinema halls , sessions and search users by email.
In turn, the user has his own basket, can add tickets to the session. He also has a list of his orders.
And together have access to information about movies, halls and movie session.

The database already has an injection of two users:

Admin -- login : admin@i.ua and password : admin123

User -- login : user@i.ua and password : user321

## Implementation details and technologies

## Overview

## Project has multiple endpoints with user and admin access
- POST: /register (to create a user) - ALL
- POST: /cinema-halls (to create a cinema hall) - ADMIN
- POST: /movies (to create a movie) - ADMIN
- POST: /movie-sessions (to create a movie sessions) - ADMIN
- POST: /orders/complete (to create an order for current user) - USER
- PUT: /movie-sessions/{id} (to update a movie session) - ADMIN
- PUT: /shopping-carts/movie-sessions (to add movie session to shopping cart) - USER
- DELETE: /movie-sessions/{id} (to delete a movie session) - ADMIN
- GET: /orders (to get order history for current user) - USER
- GET: /shopping-carts/by-user (to get a shopping cart for current user) - USER
- GET: /cinema-halls (to get all cinema halls) - USER or ADMIN
- GET: /movies (to get all movies) - USER or ADMIN
- GET: /movie-sessions/available (to get all available movie by date) - USER or ADMIN
- GET: /users/by-email (to find user by email) - ADMIN
- 
### Project based on 3-layer architecture:
>- Presentation layer (controllers)
>- Application layer (services)
>- Data access layer (DAO)

The program works on the principles of SOLID

### Technologies
>- Apache Tomcat
>- Spring
>- Spring Security
>- Spring Web
>- Hibernate
>- Hibernate validator
>- MySQL
>- JSON
>- Lombok
>- Maven
>- Maven Checkstyle Plugin

### Diagram DB
![drawing](http://dl3.joxi.net/drive/2022/01/19/0052/3292/3415260/60/8ddfb458f6.jpg)

## Setup
>1. Configure Apache Tomcat(V - 9.0.55)
>2. Install MySQL(V - 8.0)
>3. In the src/main/resources/db.properties file change properties to the ones you specified when installing MySQL
>4. add TomCat configuration to run project and start