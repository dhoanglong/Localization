package scenarios;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class IOSSetup {
    protected IOSDriver driver;

    protected void prepareIOSForAppium() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "13.3");
        capabilities.setCapability("deviceName", "Epam");
        capabilities.setCapability("xcodeOrgId", "FCTXF7Z7FZ");
        capabilities.setCapability("xcodeSigningId", "iPhone Developer");
        capabilities.setCapability("udid", "auto");
        capabilities.setCapability("bundleId", "jp.co.mec.int.smarthome");
        driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }
}
