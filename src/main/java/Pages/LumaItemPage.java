package Pages;

import BaseClass.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LumaItemPage extends TestBase {
    @FindBy(xpath = "(//ul[@role='menu'])[1]/li[4]/a")
    WebElement gearLink;
    @FindBy(xpath = "//a[@id='ui-id-27']/span ")
    WebElement watchesLink;
    @FindBy(xpath = "//a[@ href= 'https://magento.softwaretestingboard.com/luma-analog-watch.html']")
    WebElement analogWatchLink;
    @FindBy(xpath = "//button[@class='action primary tocart']")
    WebElement addLink;
    @FindBy(xpath = "//a[@class='action showcart']")
    WebElement reviewsLink;
    @FindBy(xpath = "//button[@class='action primary checkout']")
    WebElement addToCartButton;
    @FindBy(xpath = "//button[@class='action primary checkout']")
    WebElement cartOnTheTop;
    @FindBy(xpath = "//button[@title='Proceed to Checkout']")
    WebElement proceedToCheckout;

    public LumaItemPage(){
        PageFactory.initElements(chromeDriver, this);

    }
    public void navigateToLumaAnalogWatchPage(){
        gearLink.click();
        watchesLink.click();
        analogWatchLink.click();

    }
    public void addLumaAnalogWatchToCart(){
        addLink.click();
        reviewsLink.click();
        addToCartButton.click();
        cartOnTheTop.click();
        proceedToCheckout.click();
    }
}
