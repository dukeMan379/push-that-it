package Pages;

import BaseClass.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class ReviewOrderPage extends TestBase {
    @FindBy(xpath = "//button[@title='Place Order']")
    WebElement placeOrderButton;

    public ReviewOrderPage() {
        PageFactory.initElements(chromeDriver, this);
    }

    public void placeOrder() {
        try {
            //we use explicit condition waits for our placeorder web element
            WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(30));
            wait.until(ExpectedConditions.elementToBeClickable(placeOrderButton));
            placeOrderButton.click();
        } catch (Exception e) {
            System.out.println("The try did not work" + e + "\nTrying the catch now");
            WebElement element =  chromeDriver.findElement(By.xpath("//button[@title='Place Order']"));
            Actions actions = new Actions(chromeDriver);
            actions.moveToElement(element).click().build().perform();
        }
    }
}