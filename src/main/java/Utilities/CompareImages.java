package Utilities;

import com.github.romankh3.image.comparison.ImageComparison;
import com.github.romankh3.image.comparison.ImageComparisonUtil;
import com.github.romankh3.image.comparison.model.ImageComparisonResult;
import com.github.romankh3.image.comparison.model.ImageComparisonState;

import java.awt.image.BufferedImage;
import java.io.File;
import static Utilities.GetCurrentDir.currentDir;

public class CompareImages {
    public static boolean compareImages(String file){

        BufferedImage actualImage = ImageComparisonUtil.readImageFromResources(currentDir()+"/src/test/resources/actual/"+file+".png");
        BufferedImage expectedImage = ImageComparisonUtil.readImageFromResources(currentDir()+"/src/test/resources/expected/"+file+".png");

        File resultDestination = new File("./src/test/resources/result/"+file+"_fail"+".png");

        ImageComparison imageComparison = new ImageComparison( expectedImage, actualImage );

        ImageComparisonResult comparisonResult = imageComparison.compareImages();

        if(comparisonResult.getImageComparisonState().equals(ImageComparisonState.MATCH))
            return true;
        else{
            BufferedImage resultImage = comparisonResult.getResult();
            ImageComparisonUtil.saveImage(resultDestination, resultImage);
            System.out.println(file+ " is not correct");
            return false;
        }
    }
}
