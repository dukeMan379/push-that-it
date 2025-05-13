import BaseClass.TestBase;
import Pages.CreateAnAccountPage;
import Pages.LumaLandingPage;
import Pages.LumaLoginPage;
import org.testng.annotations.Test;

public class CreateAnAccountPageTest extends TestBase {
    LumaLandingPage lumaLandingPage = new LumaLandingPage();
    CreateAnAccountPage createAnAccountPage = new CreateAnAccountPage();
    LumaLoginPage lumaLoginPage = new LumaLoginPage();

    public CreateAnAccountPageTest() {

        super();
    }

    @Test
    public void CreateALumaTestAccount() {
        lumaLandingPage.clickOnCreateAnAccountLink();
        createAnAccountPage.createAnAccount("duke5", "umeh5", "duke5umeh@gmail.com",
                "Beke3umeh");
    }

    @Test
    public void signInTest() {
        lumaLandingPage.clickOnSignInLink();
        lumaLoginPage.logIn();
    }
}