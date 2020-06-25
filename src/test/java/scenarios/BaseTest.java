package scenarios;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest extends IOSSetup {

    @BeforeClass
    public void setUp() throws Exception {
        prepareIOSForAppium();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
