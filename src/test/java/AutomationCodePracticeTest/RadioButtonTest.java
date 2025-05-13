package AutomationCodePracticeTest;

public class RadioButtonTest extends TestBase1{

    public static void main(String[] args) {
        RadioButtonTest test = new RadioButtonTest();
        test.setup();  // Initialize WebDriver and open the browser

        try {
            // Navigate to the practice page
            driver.get("https://rahulshettyacademy.com/AutomationPractice/");

            // Create an instance of the RadioButtonPage
            RadioButtonPage radioButtonPage = new RadioButtonPage(driver);

            // Select the second radio button
            radioButtonPage.selectSecondRadioButton();

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            test.teardown();  // Close the browser
        }
    }
}

