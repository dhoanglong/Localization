package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
}
