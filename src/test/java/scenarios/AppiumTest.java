package scenarios;

import static Utilities.CompareImages.compareImages;

import org.testng.annotations.Test;
import pages.LoginPage;
import static pages.LoginPage.*;

public class AppiumTest extends BaseTest {

    @Test
    public void falseLoginTest() {
        new LoginPage(driver);
        softAssert.assertTrue(compareText());

//      takeScreenshot(driver,"./data/a.jpg");

        softAssert.assertTrue(compareImages("screen1.png"));
        softAssert.assertAll();
    }
}

