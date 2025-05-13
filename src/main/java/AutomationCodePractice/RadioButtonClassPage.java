package AutomationCodePractice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RadioButtonClassPage {
     WebDriver driver;

    public RadioButtonClassPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "radio2")
    private WebElement radioButton2;

    public void selectSecondRadioButton() {
        radioButton2.click();
        System.out.println("Selected Radio Button: " + radioButton2.getAttribute("value"));
    }
}



