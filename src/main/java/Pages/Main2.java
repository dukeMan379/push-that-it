package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Main2 {
    public static void main(String[] args) {
        //initialize your webdriver
        WebDriver driver = new ChromeDriver();
        //driver.get method is used to navigate to url
        driver.get("https://www.amazon.com/gp/homepage.html/?ref=wt_urltypo/");


        //to create a locator
        WebElement signIn =
                driver.findElement
                        (By.xpath("//span[@id=\"nav-link-accountList-nav-line-1\"]"));

        signIn.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement returnsAndOrders =
                driver.findElement(By.xpath("//span [@class=\"nav-line-1\"]"));

        returnsAndOrders.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);


    }
}
