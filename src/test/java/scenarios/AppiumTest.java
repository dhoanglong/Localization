package scenarios;

import org.testng.annotations.Test;
import pages.MainPage;

import static Utilities.CompareImages.compareImages;
import static Utilities.CropImage.cropImageSquare;
import static Utilities.Phones.*;
import static Utilities.TakerScreenshot.takeScreenshot;
import static pages.MainPage.*;

public class AppiumTest extends BaseTest {

//    @Test
//    public void localizationTest() throws Exception {
//        new MainPage(driver);
        //softAssert.assertTrue(compareText());
        //softAssert.assertEquals(text1.getText(), readCSV("text1"));
//
//    }


    @Test
    public void visualTest() throws Exception {
        new MainPage(driver);

        ideas.click();
        takeScreenshot(driver,"./src/test/resources/actual/ideas.png");

        things.click();
        takeScreenshot(driver,"./src/test/resources/actual/things.png");

//        softAssert.assertTrue(compareImages("ideas.png"));
//        softAssert.assertAll();
    }
}

