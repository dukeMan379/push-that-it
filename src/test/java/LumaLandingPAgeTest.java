import BaseClass.TestBase;
import Pages.LumaLandingPage;
import org.testng.annotations.Test;


public class LumaLandingPAgeTest extends TestBase {

    LumaLandingPage lumaLandingPage = new LumaLandingPage();

    public LumaLandingPAgeTest(){

        super();
    }

    @Test
    public void createAnAccountLinkTest(){
        lumaLandingPage.clickOnCreateAnAccountLink();

    }
}
