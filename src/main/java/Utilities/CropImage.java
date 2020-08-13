package Utilities;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class CropImage {

    public static void cropImageSquare(String path, Phones phone) throws IOException {

        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();

        Image src = ImageIO.read(new File(path));
        BufferedImage dst = new BufferedImage(phone.w, phone.h, BufferedImage.TYPE_INT_ARGB);
        dst.getGraphics().drawImage(src, 0, 0, phone.w, phone.h, phone.x, phone.y, phone.x + phone.w, phone.y + phone.h, null);
        ImageIO.write(dst, "png", new File(path));

//        for (int i = 0; i < listOfFiles.length; i++) {
//            if (listOfFiles[i].isFile()) {
//                System.out.println("File " + listOfFiles[i].getName());
//            }
//            Image src = ImageIO.read(new File(path + listOfFiles[i].getName()));
//            BufferedImage dst = new BufferedImage(phone.w, phone.h, BufferedImage.TYPE_INT_ARGB);
//            dst.getGraphics().drawImage(src, 0, 0, phone.w, phone.h, phone.x, phone.y, phone.x + phone.w, phone.y + phone.h, null);
//            ImageIO.write(dst, "png", new File("/Users/onsolvevn/Documents/Localization/src/test/resources/actual/" + listOfFiles[i].getName()));
//        }
    }
}
