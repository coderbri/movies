# Changelog

[//]: # (## v0.5.0 - First REST Endpoint Created)

[//]: # (v0.4.0&#40;api&#41;: added first REST endpoint)

[//]: # (---)

## v0.4.0 - First REST Endpoint Created
**Release Date**: November 27, 2025

### Summary
- Added the first REST API endpoint using `@RestController` and `@GetMapping`.
- Verified the endpoint at `"/"` returns a simple `"Hello, World!"` response.
- Learned how Spring Boot maps HTTP GET requests and how controllers expose API routes.
- Reviewed why placing endpoints inside the main application class is not a scalable structure.
- Identified the need to split the backend into layered architecture:
    - API layer (controllers)
    - Service layer (business logic)
    - Data access layer (repository/database operations)

### Purpose
This version introduces the project's **first working API route**, confirming the application can handle HTTP requests. It also establishes the foundation for reorganizing the application into proper MVC-style layers in preparation for MongoDB integration.

---

## v0.3.0 - Project Structure & Test Running the Application
**Release Date**: November 18, 2025

### Summary
- Understood full Spring Boot project structure, including breakdown of:
    - `.mvn` directory
    - `src/main` and `src/test`
    - Java package layout and generated `MoviesApplication` class
    - Resources folder purpose
- Understood how the Spring Boot application starts and the role of `@SpringBootApplication`.
- Verified successful startup through Tomcat logs and localhost testing.

### Purpose
This version establishes a clear understanding of the initial Spring Boot project layout and confirms the application runs locally, preparing for the creation of the first REST endpoint.

---

## v0.2.0 - Project Initialization
**Release Date**: November 17, 2025

### Summary
- Initialized **Spring Boot project** using Maven and Java 17.
- Configured project metadata and dependencies:
    - Lombok
    - Spring Web
    - Spring Data MongoDB
    - Spring Boot DevTools
- Extracted and imported the initialized project into IntelliJ IDEA.

### Purpose
This version marks the official **initialization of the MovieAPI backend project**, transitioning from environment and database setup to code development readiness.

---

## v0.1.0 - NoSQL Database Setup
**Release Date**: November 5, 2025

### Summary
- Set up **MongoDB Atlas** cluster and **MongoDB Compass** client.
- Created and configured a free-tier database cluster (`Cluster0`).
- Added a test database `movie-api-db` and initial collection `movies`.
- Imported movie data from a JSON file for testing.

### Purpose
This version completed the **database setup foundation** for integrating the backend with MongoDB.

---

<section align="center">
  <code>coderBri © 2025</code>
</section>