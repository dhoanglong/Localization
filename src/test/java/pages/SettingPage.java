package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SettingPage extends BasePage {
    @FindBy(xpath = "//XCUIElementTypeCell[2]/XCUIElementTypeStaticText")
    public static WebElement accounts;

    @FindBy(xpath = "//XCUIElementTypeCell[3]/XCUIElementTypeStaticText")
    public static WebElement locations;

    @FindBy(xpath = "//XCUIElementTypeCell[4]/XCUIElementTypeStaticText")
    public static WebElement getHelp;

    @FindBy(xpath = "//XCUIElementTypeCell[5]/XCUIElementTypeStaticText")
    public static WebElement about;

    @FindBy(xpath = "//XCUIElementTypeCell[6]/XCUIElementTypeStaticText")
    public static WebElement aboutYourSmartHome;

    @FindBy(xpath = "//XCUIElementTypeCell[7]/XCUIElementTypeStaticText")
    public static WebElement routineTestRun;

    @FindBy(xpath = "//XCUIElementTypeCell[8]/XCUIElementTypeStaticText")
    public static WebElement signOut;

    public SettingPage(WebDriver driver) {
        super(driver);
    }

}
