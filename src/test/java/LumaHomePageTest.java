import BaseClass.TestBase;
import Pages.LumaLandingPage;
import Pages.LumaLoginPage;
import Pages.LumaHomePage;
import Pages.MensJackets;
import org.testng.annotations.Test;

public class LumaHomePageTest extends TestBase {
    //create Object of the constructors needed
    LumaLandingPage lumaLandingPage = new LumaLandingPage();
    LumaLoginPage lumaLoginPage = new LumaLoginPage();
    LumaHomePage lumaHomePage = new LumaHomePage();
    MensJackets mensJackets = new MensJackets();



//Super constructor to navigate to the site
    public LumaHomePageTest(){

        super();
    }
    @Test
    public void navigateToMensJacket() throws Exception{
        lumaLandingPage.clickOnSignInLink();
        lumaLoginPage.logIn();
        lumaHomePage.navigateToMensJacket();
        mensJackets.selectJacketOptionAndAddToCart();




    }
}
