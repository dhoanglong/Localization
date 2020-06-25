package scenarios;

import static Utilities.CsvReader.readCSV;
import static Utilities.CompareImages.compareImages;

import org.testng.annotations.Test;
import pages.LoginPage;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static pages.LoginPage.*;
import static org.testng.Assert.assertEquals;

public class AppiumTest extends BaseTest {

    @Test
    public void falseLoginTest() {
        new LoginPage(driver);

        assertEquals(text1.getText(), readCSV().get("text1"));
        assertEquals(text2.getText(), readCSV().get("text2"));
        assertEquals(text3.getText(), readCSV().get("text3"));

        takeScreenshot(driver,"./data/a.jpg");

        if(!compareImages("screen2.png","screen1.png","b.png"));
            System.out.println("2 images mismatch");
        }
}

