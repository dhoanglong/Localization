package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

import static Utilities.CsvReader.readCSV;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"I am some page content \"]\n")
    public static WebElement text1;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"I am a div\"]")
    public static WebElement text2;

    @FindBy(xpath = "//XCUIElementTypeLink[@name=\"i am a link\"]")
    public static WebElement text3;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public static SoftAssert softAssert = new SoftAssert();

    public static boolean compareText() {
        try {
            softAssert.assertEquals(text1.getText(), readCSV().get("text1"));
            softAssert.assertEquals(text2.getText(), readCSV().get("text2"));
            softAssert.assertEquals(text3.getText(), readCSV().get("text3"));
            softAssert.assertAll();
            return true;
        }
        catch(AssertionError e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

}
