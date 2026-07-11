# InMotion Hosting Automation Framework

## Overview

This project is a UI automation framework developed to automate functional test scenarios for the InMotion Hosting website using Selenium WebDriver, Java, TestNG, and the Page Object Model (POM).

The framework follows industry best practices by separating test logic from page interactions, making the project scalable, maintainable, and easy to extend.

---

## Tech Stack

- Java 23
- Selenium WebDriver 4
- TestNG
- Maven
- Page Object Model (POM)
- WebDriverManager
- IntelliJ IDEA
- Git & GitHub

---

## Project Structure

```
InMotionHostingAutomation
│
├── src
│   ├── main
│   │   └── java
│   │       └── com.inmotion
│   │           ├── base
│   │           ├── pages
│   │           └── utilities
│   │
│   └── test
│       ├── java
│       │   └── com.inmotion.tests
│       │
│       └── resources
│           ├── config.properties
│           └── testng.xml
│
├── pom.xml
├── README.md
└── .gitignore
```

---

## Design Pattern

The framework is implemented using the **Page Object Model (POM)**.

Each web page is represented by a dedicated Java class that contains:

- Web element locators
- Page actions
- Navigation methods

Test classes only contain the test scenarios and assertions.

---

## Automated Test Scenario

### Home Page Verification

- Open https://www.inmotionhosting.com/
- Verify the page title contains **"InMotion Hosting"**
- Verify the navigation menu contains:
    - Domains
    - Web Hosting

### Domain Search

- Hover over **Domains**
- Click **Domain Name Search**
- Wait for the page to load
- Enter:
  ```
  myautomationtest123.com
  ```
- Click **Search**
- Verify:
    - The domain availability message is displayed.
    - The domain price is displayed.

---

## Prerequisites

Before running the project, ensure you have:

- Java 23 or later
- Maven 3.9+
- Google Chrome
- IntelliJ IDEA (recommended)

Verify your installation:

```bash
java --version
mvn --version
```

---

## Installation

Clone the repository:

```bash
git clone https://github.com/<your-username>/InMotionHostingAutomation.git
```

Navigate to the project:

```bash
cd InMotionHostingAutomation
```

Install dependencies:

```bash
mvn clean install
```

---

## Running the Tests

### Using IntelliJ

- Open the project.
- Right-click `testng.xml`.
- Select **Run**.

### Using Maven

Run all tests:

```bash
mvn test
```

---

## Framework Features

- Selenium WebDriver
- TestNG Framework
- Page Object Model
- Reusable Base Test
- WebDriverManager integration
- Explicit Waits
- Clean project architecture
- Easy to maintain and extend

---

## Future Enhancements

- Data-Driven Testing using Excel or JSON
- Cross-browser execution
- Parallel execution
- Extent Reports
- Log4j logging
- Screenshots on failure
- Jenkins CI/CD integration
- GitHub Actions
- Docker support

---

## Author

**Zeyad Abd Elgwad**

QA Automation Engineer

GitHub: https://github.com/ZeyadAbdelgwadhamed

LinkedIn: https://www.linkedin.com/in/zeyad-abdelgwad/
