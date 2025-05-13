package Pages;

import BaseClass.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Objects;

public class LumaHomePage extends TestBase {
    @FindBy(xpath = "(//ul[@role='menu'])[1]/li[3]/a")
    WebElement mensLink;
    @FindBy(xpath = "(//ul[@role='menu'])[1]/li[3]/ul/li[1]/a")
    WebElement topsLink;
    @FindBy(xpath = "(//ul[@role = 'menu'])[1]/li[3]/ul/li[1]/ul/li[1]/a")
    WebElement jacketLink;
    @FindBy(xpath = "//div[@class='panel header']/ul/li[2]/span/button")
    WebElement dropDownArrow;
    @FindBy(xpath = "//div[@class='panel header']/ul/li[2]/div/ul/li[1]/a")
    WebElement myAccount;


    public LumaHomePage() {
        PageFactory.initElements(chromeDriver, this);
    }


//remember when making the methods make sure you are returning an object of the
//next page from void navigateToMensJacket to MensJacket Page


    public void navigateToMensJacket() throws Exception {
        actions.moveToElement(mensLink).perform();
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        actions.moveToElement(topsLink).perform();

        WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(jacketLink));
        /*

        Wait wait1 = new FluentWait(chromeDriver);
        wait1.wait(5000);
        wait.pollingEvery(Duration.ofMillis(250));
        wait.ignoring(NoSuchElementException.class);

         */


        jacketLink.click();
        //webElement Link
        /*

        WebElement jacketText = chromeDriver.findElement(
                By.xpath("//span[contains(text(), 'jackets')]"));
        String jacketActualText = jacketText.getText();
        System.out.println(jacketActualText);
        Assert.assertEquals(jacketActualText, "jackets");

         */
        //chromeDriver.close();
        //return new MensJacket();
    }
    public void navigateToMyAccountPage(){
        dropDownArrow.click();
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        myAccount.click();
    }
}


