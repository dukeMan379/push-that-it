import BaseClass.TestBase;
import Pages.LumaLandingPage;
import Pages.MyAccountPage;
import org.testng.annotations.Test;

public class AccountPageTest extends TestBase {

    MyAccountPage myAccountPage = new MyAccountPage();

    public AccountPageTest(){

        super();
    }

    @Test
    public void editYourFirstNameOnAccount(){
        String editedFirstName = "duke12";
        String editedLastName = "umeh12";
        myAccountPage.editAccount("duke12", "umeh12");
    }
}
