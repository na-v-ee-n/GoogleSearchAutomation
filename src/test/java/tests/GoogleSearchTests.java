package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.*;
import utils.ExcelUtils;
import utils.Google_OR;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class GoogleSearchTests {
    private WebDriver driver;
    private ExtentReports extent;
    private ExtentTest test;
    private static final String EXCEL_PATH = "src/test/resources/testdata/TestData.xlsx";
    
    @BeforeSuite
    public void setupReport() {
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("extentReport.html");
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
    }
    
    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    
    @BeforeMethod
    public void navigateToGoogle() {
        driver.get("https://www.google.com/");
    }
    
    @Test(priority = 1)
    public void testGoogleSearchFunctionality() throws IOException {
        test = extent.createTest("Google Search Functionality");
        String searchQuery = ExcelUtils.getCellData(EXCEL_PATH, "Sheet1", 1, 0);
        WebElement searchBox = driver.findElement(Google_OR.searchBox);
        searchBox.sendKeys(searchQuery);
        searchBox.sendKeys(Keys.ENTER);
        test.info("Entered search query: " + searchQuery);
        Assert.assertTrue(driver.getTitle().contains(searchQuery));
    }

    @Test(priority = 2)
    public void testAutocompleteSuggestions() throws IOException {
        test = extent.createTest("Autocomplete Suggestions");
        String partialQuery = ExcelUtils.getCellData(EXCEL_PATH, "Sheet1", 2, 0);
        WebElement searchBox = driver.findElement(Google_OR.searchBox);
        searchBox.sendKeys(partialQuery);
        test.info("Typed partial search query: " + partialQuery);
        List<WebElement> suggestions = driver.findElements(Google_OR.suggestionsList);
        test.info("Fetched autocomplete suggestions");
        Assert.assertTrue(suggestions.size() > 0);
    }
    
    @Test(priority = 3)
    public void testInvalidQueryHandling() throws IOException {
        test = extent.createTest("Invalid Query Handling");
        String invalidQuery = ExcelUtils.getCellData(EXCEL_PATH, "Sheet1", 3, 0);
        WebElement searchBox = driver.findElement(Google_OR.searchBox);
        searchBox.sendKeys(invalidQuery);
        searchBox.sendKeys(Keys.ENTER);
        test.info("Entered invalid search query: " + invalidQuery);
        Assert.assertTrue(driver.getTitle().contains("Google"));
    }
    
    @AfterClass
    public void tearDown() {
        test.info("Closing browser and generating report");
        driver.quit();
        extent.flush();
    }
}
