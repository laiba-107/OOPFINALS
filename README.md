# OOP Final Paper Project

This is a Spring Boot project created for the OOP Final Paper. The application implements an Event Management System that provides REST API endpoints for managing events and tracking attendance. 

# Project Structure
src/
├── main/
│   ├── java/
│   │   └── com.example.oopfinalpaper/
│   │       ├── controller/
│   │       │   └── EventController.java
│   │       ├── dto/
│   │       │   └── EventDTO.java
│   │       ├── model/
│   │       │   └── Event.java
│   │       ├── repository/
│   │       │   └── EventRepository.java
│   │       └── service/
│   │           └── EventService.java
│   └── resources/
│       ├── application.properties
│       └── static/
└── test/

## Project Overview
The application allows users to:
- Register events with date, time, and location.
- Book tickets for events.
- View past events.
- Track event attendance and feedback.
- Generate event reports for organizers.

## Output
- The application successfully runs with the H2 in-memory database.
- REST API endpoints for managing events and users work as expected.
- The application outputs the expected data for event management.

### Output Example
- The server starts at `http://localhost:8080`.
- The H2 console is accessible at `http://localhost:8080/h2-console`.
- Sample API response for fetching events:
  ```json
  {
      "id": 1,
      "name": "Tech Conference",
      "location": "Central Hall",
      "dateTime": "2024-12-25T10:00:00",
      "ticketsAvailable": 50
  }
