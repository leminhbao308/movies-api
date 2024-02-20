# Movies API With Java

## Description

This is a simple API to manage movies. It is built with Java and Spring Boot.

## Requirements

- Java 17
- Maven
- MongoDB
- Postman (optional to test the API)

## How to run

1. Clone the repository
2. Open the project in your favorite IDE
3. Run the project by this command: `mvn spring-boot:run`
4. Open Postman and test the API

## Endpoints

- **GET** /movies - Get all movies
- **GET** /movies/{imdbId} - Get a movie by its imdbId
  <br> <br>
- **POST** /reviews - Add a review to a movie:
    ```json
    {
      "reviewBody": "This such a good movie!",
      "imdbId": "tt6443346"
    }
    ```

## References

- [Spring Boot](https://spring.io/projects/spring-boot)
- [MongoDB](https://www.mongodb.com/)
- [Postman](https://www.postman.com/)
- [Java](https://www.java.com/)
- [Maven](https://maven.apache.org/)

Thanks to [Farhan Hasin Chowdhury](https://github.com/fhsinchy/movieist) for making the tutorial on which this project
is based.