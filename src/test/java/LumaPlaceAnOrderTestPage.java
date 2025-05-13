import BaseClass.TestBase;
import Pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LumaPlaceAnOrderTestPage extends TestBase {
    LumaLandingPage lumaLandingPage = new LumaLandingPage();
    LumaLoginPage lumaLoginPage = new LumaLoginPage();
    LumaHomePage lumaHomePage = new LumaHomePage();
    MensJackets mensJackets = new MensJackets();
    ShippingPage shippingPage = new ShippingPage();
    ReviewOrderPage reviewOrderPage = new ReviewOrderPage();

    public LumaPlaceAnOrderTestPage(){
        super();

    }
    @Test
    public void placeAnOrderForMensJacketTest() throws Exception{
        lumaLandingPage.clickOnSignInLink();
        lumaLoginPage.logIn();
        lumaHomePage.navigateToMensJacket();
        mensJackets.selectJacketOptionAndAddToCart();
        shippingPage.fillOutShippingForm("332 W Regent Street Apt1", "Inglewood", "90301",
                "3107068843");
        reviewOrderPage.placeOrder();
        WebElement checkoutSuccess = chromeDriver.findElement(By.xpath("//div[@class='checkout-success']"));
        Assert.assertTrue(checkoutSuccess.isDisplayed());
    }

}