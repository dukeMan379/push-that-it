package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo1_xpath {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/products?search=t-shirt");
        driver.manage().window().maximize();
        //Absolute xpath
        driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/input[1]")).sendKeys("T-shirts");
        driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/button[1]/i[1]")).click();

        //Relative xpath
        driver.findElement(By.xpath("//input[@id='search_product']")).sendKeys("jeans");
        driver.findElement(By.xpath("//button[@id='submit_search']")).click();

        //xpath with contains() and
        driver.findElement(By.xpath("//input[contains(@id,'search')]")).sendKeys("t-shirts");
        driver.findElement(By.xpath("//button[contains(@id,'submit')]")).click();

        //xpath with text() function
        driver.findElement(By.xpath("//a[text()='Men']")).click();
    }
}
