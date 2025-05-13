package Pages;

import BaseClass.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class MensJackets extends TestBase {
    @FindBy(xpath = "//button[@ title='Add to Cart']")
    WebElement addToCartButton;

    @FindBy(xpath = "//div[@aria-label='M']")
    WebElement sizeMediumOption;

    @FindBy(xpath = "//div[@aria-label='Black']")
    WebElement colorBlackOption;

    @FindBy(xpath = "//a[@class='action showcart']")
    WebElement cartButton;

    @FindBy(xpath = "//span[contains(text(),'Proteus Fitness Jackshirt')]")
    WebElement proteusFitnessJackshirtText;

    @FindBy(xpath = "//a[@ data-bind= 'attr: {href: product_url}, html: product_name']")
    WebElement itemSelectLinkText;

    @FindBy(xpath = "//button[@class = 'action primary checkout']")
    WebElement proceedToCheckOut;

    @FindBy(xpath = "//li[@class = 'item product product-item'][1]")
    WebElement firstJacketImage;


    public MensJackets() {

        PageFactory.initElements(chromeDriver, this);
    }

    public void selectJacketOptionAndAddToCart() {
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        actions.moveToElement(firstJacketImage).perform();
        firstJacketImage.click();
        sizeMediumOption.click();
        colorBlackOption.click();
        addToCartButton.click();
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        cartButton.click();
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        proceedToCheckOut.click();


    }
}