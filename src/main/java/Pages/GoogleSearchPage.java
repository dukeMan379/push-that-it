package Pages;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {

    //lunch WebDriver instance
    WebDriver driver;

    //create a constructor
    public GoogleSearchPage(WebDriver driver){
        this.driver = driver;

    }
    //Actual locator finding
    By searchbox = By.xpath("//textarea[@name = 'q']");

    //to send something to searchbox

    public void searchgoogle(String Searchinput){
        driver.findElement(searchbox).sendKeys(Searchinput);

    }


}
