package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

import static Utilities.CsvReader.readCSV;

public class LoginPage extends BasePage {
    @FindBy(xpath = "//XCUIElementTypeButton[@name='Favorites']")
    public static WebElement favorites;

    @FindBy(xpath = "//XCUIElementTypeButton[@name='Things']")
    public static WebElement things;

    @FindBy(xpath = "//XCUIElementTypeButton[@name='Scenes']")
    public static WebElement scenes;

    @FindBy(xpath = "//XCUIElementTypeButton[@name='Settings']")
    public static WebElement settings;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public static SoftAssert softAssert = new SoftAssert();

    public static boolean  compareText() {
        try {
            //softAssert.assertEquals(text1.getText(), readCSV("text1"));
            //softAssert.assertEquals(text2.getText(), readCSV("text2"));
            //softAssert.assertEquals(text3.getText(), readCSV("text3"));

            softAssert.assertAll();
            return true;
        }
        catch(AssertionError e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

}
