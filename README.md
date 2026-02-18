# 🧪 QA Automation Labs

A comprehensive repository dedicated to mastering **Web UI Automation** using **Java** and **Selenium WebDriver**. This project demonstrates various automation practices, focusing on robust script development and synchronization strategies.

## 🛠️ Technology Stack
* **Language:** Java (JDK 11+)
* **Automation Tool:** Selenium WebDriver
* **Test Runner:** TestNG / JUnit
* **Build Tool:** Maven
* **Design Pattern:** Page Object Model (POM)

## ✨ Key Features
- **Page Object Model (POM):** Ensures clean, maintainable, and reusable code by separating UI elements from test logic.
- **Dynamic Synchronization:** Implementation of `WebDriverWait` (Explicit/Fluent waits) to handle asynchronous web elements and reduce flakiness.
- **Modular Test Suites:** Organized test cases covering various web functionalities (Forms, Alerts, Tables, etc.).

## 📂 Project Structure

```text
src
├── main
├── test
│    └── java
│         ├── pages       (Page Objects)
│         ├── tests       (Test Cases)
│         └── utilities   (Driver, ConfigReader)
└── pom.xml
└── README.md
```

## 🚀 How to Run Tests

```bash
# Clone the repository
git clone https://github.com/fatmagulergani/QaAutomationLabs.git

# Navigate to the project folder
cd QaAutomationLabs

# Run the tests
mvn clean test
```
---

📫 **Contact:** https://www.linkedin.com/in/fatmagul-ergani-yalcin/