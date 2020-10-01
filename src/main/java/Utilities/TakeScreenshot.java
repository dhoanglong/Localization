package Utilities;

import io.appium.java_client.ios.IOSDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class TakeScreenshot {
    public static void takeScreenshot(IOSDriver driver, Phones phone, String outputLocation) {
        try {
            System.out.println("Capturing the snapshot of the page ");
            Thread.sleep(1000);
            File srcFiler = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(srcFiler, new File("src/test/resources/actual/"+outputLocation+".png"),false);
            cropImageSquare("src/test/resources/actual/"+outputLocation+".png", phone);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    public static void cropImageSquare(String path, Phones phone) throws IOException {
        Image src = ImageIO.read(new File(path));
        BufferedImage dst = new BufferedImage(phone.w, phone.h, BufferedImage.TYPE_INT_ARGB);
        dst.getGraphics().drawImage(src, 0, 0, phone.w, phone.h, phone.x, phone.y, phone.x + phone.w, phone.y + phone.h, null);
        ImageIO.write(dst, "png", new File(path));
        src.flush();
    }
}
