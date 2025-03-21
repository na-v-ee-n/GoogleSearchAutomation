# Google Search Automation 🚀  

## Overview  
This project automates **Google Search** functionality using Selenium WebDriver, Java, and TestNG. It is designed to execute multiple test scenarios, handle dynamic elements, and generate detailed reports with Extent Reports.  

## 🔹 Tech Stack  
- **Java** – Core programming language  
- **Selenium WebDriver** – For browser automation  
- **TestNG** – Test execution & reporting  
- **Apache POI** – Read test data from Excel  
- **Extent Reports** – Generate detailed test reports  
- **Maven** – Dependency & project management  
- **Multithreading** – Parallel test execution  

## 📌 Features  
✅ Covers **22+ test cases**, including functional, UI, security, and performance tests  
✅ Uses **Page Object Model (POM)** for better test structure  
✅ Reads test data from **Excel (Apache POI integration)**  
✅ Supports **cross-browser testing**  
✅ Provides **detailed Extent Reports** with logs & screenshots  
✅ Implements **multithreading for parallel execution**  

## 🛠 Project Structure  
```
GoogleSearchAutomation/
│── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── pages/          # Page Object Model (POM) classes
│   │   │   ├── utils/          # Utility classes (Excel handling, logging, etc.)
│   ├── test/
│   │   ├── java/
│   │   │   ├── tests/          # TestNG test classes
│── test-output/                 # Extent Reports generated after execution
│── pom.xml                      # Maven dependencies
│── README.md                    # Project documentation
│── testdata.xlsx                 # Test data for execution
```

## 🏃 How to Run the Tests?  

### **1️⃣ Clone the Repository**  
```sh
git clone https://github.com/your-username/GoogleSearchAutomation.git
cd GoogleSearchAutomation
```

### **2️⃣ Setup Dependencies**  
Ensure you have **Java (JDK 11+)**, **Maven**, and **TestNG** installed. Run:  
```sh
mvn clean install
```

### **3️⃣ Run Tests**  
- Run all tests:  
  ```sh
  mvn test
  ```
- Run specific tests using TestNG XML:  
  ```sh
  mvn test -DsuiteXmlFile=testng.xml
  ```

### **4️⃣ View Test Reports**  
- After execution, open:  
  ```sh
  test-output/ExtentReports.html
  ```

## 📞 Test Scenarios Covered  
| SI.No | Test Case | Description |
|-------|----------|-------------|
| 1  | Google Search | Verify search functionality |
| 2  | Autocomplete | Check autocomplete suggestions |
| 3  | Voice Search | Validate voice search feature |
| 4  | Search with Long Query | Test long queries (500+ chars) |
| 5  | UI Elements Visibility | Ensure logo, buttons, and search bar are visible |
| 6  | Cross-Browser Compatibility | Run tests on Chrome, Firefox, Edge, Safari |
| 7  | Dark Mode Appearance | Check UI elements in dark mode |
| ... | More test cases... | |

## 📢 Contributions  
Want to enhance this project? Fork, modify, and submit a **Pull Request** 🚀  

