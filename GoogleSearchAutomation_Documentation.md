1. Project Overview

This project is an automated test suite for Google Search functionality using Java, Selenium, TestNG, and Extent Reports. The goal is to validate various search features on Google, ensuring functionality across different scenarios, including positive, negative, UI, and performance tests.

2. Technology Stack

Programming Language: Java

Automation Framework: Selenium WebDriver

Test Runner: TestNG

Build Tool: Maven

Reporting: Extent Reports

Data Handling: Apache POI for reading test data from an Excel file

Multithreading: Parallel execution using TestNG configurations

3. Project Structure

GoogleSearchAutomation/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── utils/
│   │   │   │   ├── ExcelUtils.java  # Reads data from Excel
│   │   │   ├── base/
│   │   │   │   ├── BaseTest.java  # WebDriver setup & teardown
│   │   ├── resources/
│   ├── test/
│   │   ├── java/
│   │   │   ├── tests/
│   │   │   │   ├── GoogleSearchTests.java  # Test cases implementation
│   │   │   ├── objectrepository/
│   │   │   │   ├── Google_OR.java  # Page locators
│   │   ├── resources/
│   │   │   ├── testdata/
│   │   │   │   ├── TestData.xlsx  # Test data for execution
├── pom.xml  # Maven dependencies & project setup
├── testng.xml  # TestNG execution configuration

4. Test Scenarios Covered

The automation suite covers 22 test cases, including:

Functional Tests (Search functionality, Auto-suggestions, I'm Feeling Lucky, etc.)

Negative Tests (Blank search, special characters, JavaScript disabled, no internet, etc.)

UI Tests (Google Logo visibility, search bar UI, dark mode support, etc.)

Performance & Compatibility Tests (Page load speed, browser compatibility, mobile responsiveness, etc.)

5. Test Execution & Reporting

Parallel Execution: Configured in testng.xml for faster test execution.

Logging: Each test logs execution steps into Extent Reports.

Test Results:

Passed tests ✅ are logged in green

Failed tests ❌ include error stack traces

Skipped tests ⚠️ show reasons for skipping

Report Location: test-output/ExtentReports.html

6. Multithreading & Optimisation

Uses TestNG parallel execution to run tests on multiple threads.

Optimised WebDriver instantiation to avoid redundant object creation.

Explicit waits are used instead of Thread.sleep() to improve test reliability.

7. Setup & Execution Guide

Prerequisites

Install Java 8+

Install Maven

Install ChromeDriver or appropriate WebDriver for your browser

How to Run the Tests

Clone the Repository

git clone <repository-url>
cd GoogleSearchAutomation

Install Dependencies

mvn clean install

Execute Tests

mvn test

View Reports
Open test-output/ExtentReports.html in a browser

8. Future Enhancements

Implement Page Object Model (POM) for better maintainability.

Add Docker-based Selenium Grid execution.

Extend tests to validate Google search in different languages.