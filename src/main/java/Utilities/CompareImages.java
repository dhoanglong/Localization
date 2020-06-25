package Utilities;

import com.github.romankh3.image.comparison.ImageComparison;
import com.github.romankh3.image.comparison.ImageComparisonUtil;
import com.github.romankh3.image.comparison.model.ImageComparisonResult;
import com.github.romankh3.image.comparison.model.ImageComparisonState;

import java.awt.image.BufferedImage;
import java.io.File;

public class CompareImages {
    public static boolean compareImages(String actual, String expected, String result) {
        BufferedImage actualImage = ImageComparisonUtil.readImageFromResources("./actual/"+actual);
        BufferedImage expectedImage = ImageComparisonUtil.readImageFromResources("./expected/"+expected);

        File resultDestination = new File("./src/test/resources/result/"+result );

        ImageComparison imageComparison = new ImageComparison( expectedImage, actualImage, resultDestination );

        ImageComparisonResult comparisonResult = imageComparison.compareImages();

        if(comparisonResult.getImageComparisonState().toString() == "MATCH")
            return true;
        else{
            BufferedImage resultImage = comparisonResult.getResult();
            ImageComparisonUtil.saveImage(resultDestination, resultImage);
            return false;
        }
    }
}
