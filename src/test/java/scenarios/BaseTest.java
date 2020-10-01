package scenarios;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;
import pages.MainPage;
import pages.SettingPage;

public class BaseTest extends IOSSetup {

    @BeforeClass
    public void setUp() throws Exception {
        prepareIOSForAppium();

    }

//    @AfterClass
//    public void tearDown() {
//        driver.quit();
//    }

    public static SoftAssert softAssert = new SoftAssert();

}
