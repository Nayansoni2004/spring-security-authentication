# Spring Security Authentication (m20)

A **Spring Boot** project demonstrating **secure user authentication** using **Spring Security**, **MySQL database**, and **BCrypt password encryption**.
This project shows how to implement login authentication by loading user details from a database.

---

## Features

* User Signup API
* Password encryption using BCrypt
* Authentication using Spring Security
* Custom `UserDetailsService` implementation
* MySQL database integration
* REST API based architecture
* Public and secured endpoints handling

---

## Tech Stack

* **Backend:** Java, Spring Boot
* **Security:** Spring Security
* **Database:** MySQL
* **ORM:** Spring Data JPA (Hibernate)
* **Build Tool:** Maven

---

## Project Structure

```
com.isrdc
│── configs        # Security Configuration
│── entities       # JPA Entity classes
│── repos          # Repository interfaces
│── rests          # REST Controllers
│── services       # Business logic & authentication service
```

---

## Configuration

Update your database credentials in:

```
src/main/resources/application.yml
```

Example configuration:

```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/m20springsecurityauthenticationdb
    username: root
    password: your_password

  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true

server:
  port: 9090
```

---

## API Endpoints

### Signup

**POST /signup**

#### Request Body:

```json
{
  "name": "Virat Kohli",
  "email": "kohli@gmail.com",
  "password": "1234",
  "phone": "9999999999"
}
```

#### Response:

```
Congratulations!!! SignUp Successful...
```

---

## Authentication Process

* Authentication is handled by **Spring Security**
* User credentials are fetched from the database
* Password is matched using **BCrypt encryption**

### Login 

Use **Basic Authentication** in Postman or browser:

* **Username:** email
* **Password:** plain password (automatically verified with encrypted password)

---

## Testing (Postman)

1. Call **POST /signup** to register a user
2. Open Postman
3. Go to **Authorization → Basic Auth**
4. Enter:

   * Username = email
   * Password = password
5. Access any secured API

---

## Security Configuration

* `/signup` → Public (no authentication required)
* All other endpoints → Secured
* Password stored in encrypted format (BCrypt)
* CSRF disabled (for development/testing)

---

## Run the Project

### Using Maven:

```bash
mvn spring-boot:run
```

### Or run:

```
M20SpringSecurityAuthenticationApplication.java
```

---

## Future Enhancements

* JWT Authentication (Token-based login)
* Role-Based Authorization (ADMIN / USER)
* Custom Login API
* Global Exception Handling
* Email verification system

---

## Learning Highlights

* How Spring Security works internally
* How authentication flow is handled
* How to integrate DB-based login system
* Password encryption using BCrypt
* Secure API development

---

## Author

**Nayan**
Aspiring Backend Developer
Focused on Java, Spring Boot & Microservices

---

## Support

If you found this project useful:

* ⭐Star the repository
* 🍴 Fork it
* 📢 Share with others

---
