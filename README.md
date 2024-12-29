# personal-expenses-tracker/personal-expenses-tracker/README.md

# Personal Expenses Tracker

This is a personal expenses tracker application developed using Spring Boot. The application allows users to manage their expenses efficiently by providing features to add, view, and delete expenses.

## Features

- Add new expenses with details such as description, amount, and date.
- View a list of all recorded expenses.
- Delete expenses as needed.

## Project Structure

```
personal-expenses-tracker
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── anirthec
│   │   │           └── expencetrack
│   │   │               ├── ExpenceTrackApplication.java
│   │   │               ├── controller
│   │   │               │   └── ExpenseController.java
│   │   │               ├── model
│   │   │               │   └── Expense.java
│   │   │               ├── repository
│   │   │               │   └── ExpenseRepository.java
│   │   │               └── service
│   │   │                   └── ExpenseService.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── static
│   │           └── index.html
├── .gitignore
├── pom.xml
└── README.md
```

## Setup Instructions

1. Clone the repository:
   ```
   git clone <repository-url>
   ```

2. Navigate to the project directory:
   ```
   cd personal-expenses-tracker
   ```

3. Build the project using Maven:
   ```
   mvn clean install
   ```

4. Run the application:
   ```
   mvn spring-boot:run
   ```

5. Access the application at `http://localhost:8080`.

## Usage Guidelines

- Use the front-end interface to add and manage your expenses.
- Ensure that you have the necessary database configurations set in `application.properties`.

## License

This project is licensed under the MIT License.