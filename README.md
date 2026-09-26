# Selenium Login Testing

A simple Selenium automation testing project for testing a login flow.

The project uses Selenium WebDriver with Java, JUnit 5, and Maven. The login page is a small Next.js frontend connected to a Spring Boot backend.

## Tech Stack

* Java 21
* Selenium WebDriver
* JUnit 5
* Maven
* Spring Boot
* Next.js

## What is tested

* Valid login
* Invalid login
* Login success/error message
* Explicit waits
* Page Object Model (POM)

## Project Structure

```text
src
├── main
│   └── java
│
└── test
    └── java
        └── com.example.selenium_login_testing
            ├── LoginTest.java
            └── pages
                └── LoginPage.java
```

## Run the project

Start the Spring Boot backend on port `8080`.

Then start the Next.js frontend on port `3000`.

After both are running, execute:

```bash
mvn test
```

Chrome will open automatically when the Selenium tests run.

## Test Result

The current test suite covers both successful and failed login scenarios.

```text
Tests run: 3
Failures: 0
Errors: 0
BUILD SUCCESS
```

## Purpose

This project is mainly for learning Selenium automation, writing maintainable test cases with Page Object Model, and understanding how UI tests interact with a backend application.
