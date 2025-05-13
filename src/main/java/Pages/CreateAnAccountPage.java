package Pages;

import BaseClass.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAnAccountPage extends TestBase {

    @FindBy(xpath = "//input[@id ='firstname']")
    WebElement firstNameField;

    @FindBy(xpath = "//input[@id = 'lastname']")
    WebElement lastNameField;

    @FindBy(xpath = "//input[@id = 'email_address']")
    WebElement emailAddressField;


    @FindBy(xpath = "//input[@id = 'password']")
    WebElement passWordField;

    @FindBy(xpath = "//input[@id = 'password-confirmation']")
    WebElement passWordConfirmationField;

    @FindBy(xpath = "//button[@title='Create an Account']")
    WebElement createAnAccountButton;

    public CreateAnAccountPage(){

        PageFactory.initElements(chromeDriver, this);
    }

    public void createAnAccount(String firstName, String lastName, String email, String myPassWord){
        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        emailAddressField.sendKeys(email);
        passWordField.sendKeys(myPassWord);
        passWordConfirmationField.sendKeys(myPassWord);
        createAnAccountButton.click();
    }
}
