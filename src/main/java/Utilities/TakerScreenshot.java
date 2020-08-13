package Utilities;

import io.appium.java_client.ios.IOSDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

import static Utilities.CropImage.cropImageSquare;
import static Utilities.Phones.IPHONE11;

public class TakerScreenshot {
    public static void takeScreenshot(IOSDriver driver, String outputLocation ) {
        try {
            System.out.println("Capturing the snapshot of the page ");
            Thread.sleep(1000);
            File srcFiler = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(srcFiler, new File(outputLocation));
            cropImageSquare(outputLocation, IPHONE11);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
