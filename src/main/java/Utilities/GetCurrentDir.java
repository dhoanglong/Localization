package Utilities;

public class GetCurrentDir {
    public static String currentDir(){
        String dir = System.getProperty("user.dir");
        return dir;
    }
}
