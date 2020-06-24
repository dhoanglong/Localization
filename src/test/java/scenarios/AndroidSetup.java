package scenarios;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;


public class AndroidSetup {
    protected IOSDriver driver;

    protected void prepareAndroidForAppium() throws MalformedURLException {
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("appium-version", "1.0");
//        capabilities.setCapability("platformName", "Android");
//        capabilities.setCapability("platformVersion", "8.1.0");
//        capabilities.setCapability("deviceName", "Pixel2");
//        capabilities.setCapability("app", "/Users/onsolvevn/Documents/Localization/apps/flipkart.apk");
//        capabilities.setCapability("appPackage", "com.flipkart.android");
//        capabilities.setCapability("appActivity", "com.flipkart.android.SplashActivity");
//        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "13.3");
        capabilities.setCapability("deviceName", "iPhone X");
        capabilities.setCapability("deviceOrientation", "portrait");
        capabilities.setCapability("appiumVersion", "1.16");
        capabilities.setCapability("autoAcceptAlerts", "true");
        capabilities.setCapability("noReset", "true");
        capabilities.setCapability("app", "/Users/onsolvevn/Documents/Localization/apps/test.app");
        driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
    }
}
