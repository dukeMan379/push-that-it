
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        //initialize your webdriver
        WebDriver driver = new ChromeDriver();
        
        //driver.get method is used to navigate to url
        driver.get("https://cogmento.com/");

        //to create a locator
        WebElement loginButton =
                driver.findElement
                        (By.xpath("//a [@href=\"https://ui.freecrm.com\"]"));

        loginButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement signUp =
                driver.findElement(By.xpath("//a[@ href=\"https://api.cogmento.com/register?lang=en-GB\"]"));

        signUp.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);


    }
}

