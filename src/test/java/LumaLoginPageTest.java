import BaseClass.TestBase;
import Pages.LumaLandingPage;
import Pages.LumaLoginPage;
import org.testng.annotations.Test;

public class LumaLoginPageTest extends TestBase {
    LumaLandingPage lumaLandingPage = new LumaLandingPage();
    LumaLoginPage lumaLoginPage = new LumaLoginPage();

    public LumaLoginPageTest() {

        super();
    }

    @Test
    public void loginTest() {
        lumaLandingPage.clickOnSignInLink();
        lumaLoginPage.logIn();
    }
}

