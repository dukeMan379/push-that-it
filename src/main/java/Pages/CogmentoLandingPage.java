package Pages;

import BaseClass.TestBase;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CogmentoLandingPage extends TestBase {

    //create an Object Repository
    //FindBy Annotation that comes with a PageFactory class in Selenium
    @FindBy(xpath = "//a[@href=\"https://ui.freecrm.com\"]")
    WebElement loginButton;

    //we need a constructor for our page classes
    //our constructor will initialize our web elements so we can use them in our class
    public CogmentoLandingPage() {
        SearchContext chromeDriver = null
        PageFactory.initElements(chromeDriver, this);
    }

    //create a method to get to the login page
    public void  navigateToLoginButton() {
        //to get to the login page from the landing page
        //you will have to click on login button
        loginButton.click();
    }
}
