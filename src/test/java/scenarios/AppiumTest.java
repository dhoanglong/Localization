package scenarios;

import org.testng.annotations.Test;
import pages.MainPage;
import pages.SettingPage;
import static Utilities.CompareImages.compareImages;
import static Utilities.CsvReader.readCSV;
import static Utilities.Phones.*;
import static Utilities.TakeScreenshot.takeScreenshot;
import static pages.MainPage.*;
import static pages.SettingPage.*;

public class AppiumTest extends BaseTest {

    @Test
    public void localizationTest(){
        new MainPage(driver);
        new SettingPage(driver);

        settings.click();

        softAssert.assertEquals(accounts.getText(), readCSV("accounts"));
        softAssert.assertEquals(locations.getText(), readCSV("locations"));
        softAssert.assertEquals(getHelp.getText(), readCSV("getHelp"));
        softAssert.assertEquals(about.getText(), readCSV("about"));
        softAssert.assertEquals(aboutYourSmartHome.getText(), readCSV("aboutYourSmartHome"));
        softAssert.assertEquals(routineTestRun.getText(), readCSV("routineTestRun"));
        softAssert.assertEquals(signOut.getText(), readCSV("signOut"));

        softAssert.assertAll();
    }


    @Test
    public void visualTesting(){
        new MainPage(driver);

        takeScreenshot(driver, IPHONE11,"favorites");

        things.click();
        takeScreenshot(driver, IPHONE11,"things");

        scenes.click();
        takeScreenshot(driver, IPHONE11,"scenes");

        ideas.click();
        takeScreenshot(driver, IPHONE11,"ideas");

        settings.click();
        takeScreenshot(driver, IPHONE11, "settings");

        softAssert.assertTrue(compareImages("favorites"));
        softAssert.assertTrue(compareImages("things"));
        softAssert.assertTrue(compareImages("scenes"));
        softAssert.assertTrue(compareImages("ideas"));
        softAssert.assertTrue(compareImages("settings"));
        softAssert.assertAll();
    }
}

