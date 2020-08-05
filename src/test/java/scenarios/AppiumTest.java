package scenarios;

import Utilities.Phones;
import org.testng.annotations.Test;
import pages.LoginPage;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

import static Utilities.CropImage.cropImageSquare;
import static Utilities.Phones.*;

public class AppiumTest extends BaseTest {

    @Test
    public void falseLoginTest() throws Exception {
        new LoginPage(driver);

//        takeScreenshot(driver,"./src/test/resources/actual/favorites.png");
//        things.click();
//        takeScreenshot(driver,"./src/test/resources/actual/things.png");
//        scenes.click();
//        takeScreenshot(driver,"./src/test/resources/actual/scenes.png");
//        settings.click();
//        takeScreenshot(driver,"./src/test/resources/actual/settings.jpg");
//
//        compareImages("things.png");

        //softAssert.assertTrue(compareText());
        //softAssert.assertEquals(text1.getText(), readCSV("text1"));path
//      softAssert.assertTrue(compareImages("screen1_correct.png"));
//        softAssert.assertAll();
        cropImageSquare("/Users/onsolvevn/Documents/Localization/src/test/resources/actual/", IPHONE11);
    }
}

