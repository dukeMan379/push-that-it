package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestBase {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public void setup() {
        // Set the path for the ChromeDriver
        //System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver"); // Update the path accordingly

        // Initialize the Chrome driver
        driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Initialize WebDriverWait
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void teardown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}