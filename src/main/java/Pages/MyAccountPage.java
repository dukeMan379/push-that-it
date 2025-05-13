package Pages;

import BaseClass.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends TestBase {
    @FindBy(xpath = "//a[@class ='action edit']")
    WebElement editLink;
    @FindBy(xpath = "//input[@name ='firstname']")
    WebElement firstNameEdited;
    @FindBy(xpath = "//input[@name ='lastname']")
    WebElement lastNameEdited;
    @FindBy(xpath = "//button[@class='action save primary']")
    WebElement saveButton;

    public MyAccountPage() {
        PageFactory.initElements(chromeDriver, this);
    }

    public void editAccount(String editedFirstName, String editedLastName) {
        editLink.click();
        firstNameEdited.sendKeys(editedFirstName);
        lastNameEdited.sendKeys(editedLastName);
        saveButton.click();

    }
}




