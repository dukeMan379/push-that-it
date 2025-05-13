package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mens watches");
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
    }
}
