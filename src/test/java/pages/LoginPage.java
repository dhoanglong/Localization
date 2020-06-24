package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends BasePage {

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"i appear 3 times\"])[2]")
    private WebElement h1Text;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void invalidLogin() {
//        waitForVisibilityOf(existingUser_login);
//        driver.findElement(existingUser_login).click();
//        driver.findElement(userId).clear();
//        driver.findElement(userId).sendKeys("someone@testvagrant.com");
//        driver.findElement(password).sendKeys("testvagrant123");
//        driver.findElement(login_Button).click();
//        Assert.assertTrue(driver.findElement(By.id("pageLevelError")).getText().equalsIgnoreCase("Account does not exist"));
        //return new LoginPage(driver);
        System.out.println(h1Text.getText());
    }
}
