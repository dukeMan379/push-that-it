package Pages;

import BaseClass.TestBase;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LumaLandingPage extends TestBase {

    @FindBy(xpath = "//a[@ href=\"https://magento.softwaretestingboard.com/customer/account/create/\"]")
    WebElement createAnAccountLink;

    @FindBy(xpath = "//a[contains(text(), 'Sign In')][1]")
    WebElement signInButtonLink;

    public LumaLandingPage(){

        PageFactory.initElements(chromeDriver, this);
    }
    public void clickOnCreateAnAccountLink(){
    createAnAccountLink.click();
    }
    public void clickOnSignInLink(){

        signInButtonLink.click();
    }
}

