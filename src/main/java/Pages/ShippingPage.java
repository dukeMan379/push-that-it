package Pages;

import BaseClass.TestBase1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.List;

public class ShippingPage extends TestBase1 {
    @FindBy(xpath = "//input[@name = 'street[0]']")
    WebElement streetAddressField;

    @FindBy(xpath = "//input[@name = 'city']")
    WebElement cityField;

    @FindBy(xpath = "//div[@name = 'shippingAddress.region_id']//dv[@class ='control']")
    WebElement stateDropList;

    @FindBy(xpath = "")
    WebElement zipCodeField;

    @FindBy(xpath = "//button[@type='submit' and @data-role]")
    WebElement phoneNumberfield;

    @FindBy(xpath = "//input[@value='flatrate_flatrate']")
    WebElement flatRateRadiationButton;

    @FindBy(xpath = "//button[@type='submit' and @data-role]")
    WebElement nextButton;

    @FindBy(xpath = "//div[@class = 'shipping-address-item selected-item']")
    WebElement existingShippingAddress;

    @FindBy(xpath = "//div[@class = 'new-address-popup']/button")
    WebElement newShippingAddressButton;

    @FindBy(xpath = "//button[@class = 'action primary action-save-address']")
    WebElement shipToThisAddressButton;

    public ShippingPage() {

        PageFactory.initElements(chromeDriver, this);
    }

    public void fillOutShippingForm(String street, String city, String zipCode, String phoneNumber) {
        //if condition
        if (existingShippingAddress.isDisplayed()) {
            flatRateRadiationButton.click();
            nextButton.click();

        } else {
            newShippingAddressButton.click();
            streetAddressField.sendKeys(street);
            cityField.sendKeys(city);
            stateDropList.click();
            List<WebElement> cityOptions = chromeDriver.findElements(
                    By.xpath("//div[@name = 'shippingAddress.region_id']//div//select//option"));
            for (WebElement option : cityOptions) {
                if (option.getText().contains("California")) {
                    option.click();
                    break;
                }
            }

            zipCodeField.sendKeys(zipCode);
            phoneNumberfield.sendKeys(phoneNumber);
            newShippingAddressButton.click();
            chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            flatRateRadiationButton.click();
            nextButton.click();
            //new ReviewOrderPage();

        }

    }
}