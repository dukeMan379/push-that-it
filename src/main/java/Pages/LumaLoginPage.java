package Pages;

import BaseClass.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LumaLoginPage extends TestBase {
    @FindBy(xpath = "//input[@id='email']")
    WebElement emailField;
    @FindBy(xpath = "//input[@id='pass']")
    WebElement passwordField;
    @FindBy(xpath = "//button[@name='send']")
    WebElement signInButton;

    public LumaLoginPage() {

        PageFactory.initElements(chromeDriver, this);
    }

    public void logIn(){
        emailField.sendKeys("duke5umeh@gmail.com");
        passwordField.sendKeys("Beke3umeh1");
        signInButton.click();
    }
}