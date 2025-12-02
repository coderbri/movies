# Changelog

[//]: # (## v0.8.0 - ...)

[//]: # (---)

## v0.7.0 - GET One Movie Endpoint (ObjectId & IMDb ID)
**Release Date**: December 2, 2025

### Summary
- Added support for retrieving a **single movie** from MongoDB.
- Implemented initial lookup using MongoDB’s `_id` field:
    - Added `singleMovie(ObjectId id)` method in `MovieService`.
    - Created `GET /api/v1/movies/{id}` endpoint using `@PathVariable`.
    - Returned results wrapped in `Optional<Movie>` to safely handle missing entries.
- Improved endpoint design by replacing raw `ObjectId` lookup with `imdbId`:
    - Added `findMovieByImdbId(String imdbId)` to `MovieRepository` using Spring Data’s derived query methods.
    - Updated service method to use `imdbId` instead of `ObjectId`.
    - Updated controller to expose `GET /api/v1/movies/{imdbId}`.
- Successfully tested endpoint via browser and sample IMDb IDs such as:
    - `http://localhost:8080/api/v1/movies/tt0499549`

### Purpose
This version extends the API by enabling lookup of individual movies.  
It replaces the less user-friendly MongoDB `ObjectId` with a clean public-facing `imdbId`, preparing the backend for client applications that need single-movie views.

---

## v0.6.0 - Models, Repository, Service Layer & GET All Movies API
**Release Date**: December 1, 2025

### Summary
- Created **Movie** and **Review** model classes to represent MongoDB documents.
    - Annotated models using `@Document`, `@Id`, and `@DocumentReference`.
    - Implemented Lombok annotations (`@Data`, `@AllArgsConstructor`, `@NoArgsConstructor`) for boilerplate reduction.
    - Defined a manual reference relationship for associating movies with review IDs.
- Implemented the first REST controller:
    - Added `MovieController` with `/api/v1/movies` endpoint.
    - Returned HTTP responses using `ResponseEntity`.
- Built foundational backend layers:
    - Created `MovieRepository` interface extending `MongoRepository`.
    - Implemented `MovieService` as the business logic layer.
    - Connected Controller → Service → Repository for clean three-tier architecture.
- Implemented the first functional API endpoint:
    - **GET /api/v1/movies** returns the full list of movies from MongoDB.
    - Verified with browser testing and `curl` response headers.

### Purpose
This version introduces the full MVC structure required for backend development. 
It establishes clean separation of concerns and successfully retrieves real movie data through the project's first API.

---

## v0.5.0 - Database Configuration & Environment Variable Setup
**Release Date**: November 27, 2025

### Summary
- Configured the application to connect to the MongoDB cluster using `application.properties`.
- Added MongoDB connection values:
    - `spring.data.mongodb.database`
    - `spring.data.mongodb.uri`
- Created a secure `.env` file in `src/main/resources` to store sensitive information:
    - `MONGO_DATABASE`
    - `MONGO_USER`
    - `MONGO_PASSWORD`
    - `MONGO_CLUSTER`
- Added `.env.example` for public repository use, containing variable names without sensitive values.
- Updated `.gitignore` to ensure `.env` is excluded from version control.
- Installed `spring-dotenv` Maven dependency to enable Spring Boot to read environment variables.
- Updated `application.properties` to load variables via `${env.VARIABLE_NAME}` notation.
- Verified the application can now securely connect to the MongoDB Atlas cluster using environment variables.

### Purpose
This version establishes secure, maintainable database configuration practices.  
It ensures sensitive credentials remain private while providing a clean and scalable way to manage environment variables for future deployment.

---

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