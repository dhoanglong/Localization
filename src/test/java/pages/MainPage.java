package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {
    @FindBy(xpath = "//XCUIElementTypeButton[1]")
    public static WebElement favorites;

    @FindBy(xpath = "//XCUIElementTypeButton[2]")
    public static WebElement things;

    @FindBy(xpath = "//XCUIElementTypeButton[3]")
    public static WebElement scenes;

    @FindBy(xpath = "//XCUIElementTypeButton[4]")
    public static WebElement ideas;

    @FindBy(xpath = "//XCUIElementTypeButton[5]")
    public static WebElement settings;

    public MainPage(WebDriver driver) {
        super(driver);
    }

}
