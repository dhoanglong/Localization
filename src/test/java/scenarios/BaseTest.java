package scenarios;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

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
