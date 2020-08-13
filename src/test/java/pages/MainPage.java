package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

import static Utilities.CsvReader.readCSV;

public class MainPage extends BasePage {
    @FindBy(xpath = "//XCUIElementTypeButton[@name='Favorites']")
    public static WebElement favorites;

    @FindBy(xpath = "//XCUIElementTypeButton[@name='Things']")
    public static WebElement things;

    @FindBy(xpath = "//XCUIElementTypeButton[@name='Scenes']")
    public static WebElement scenes;

    @FindBy(xpath = "//XCUIElementTypeButton[@name='Ideas']")
    public static WebElement ideas;

    @FindBy(xpath = "//XCUIElementTypeButton[@name='Settings']")
    public static WebElement settings;

    public MainPage(WebDriver driver) {
        super(driver);
    }

}
