import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File input = new File("D:/spisok");
        File output = new File("D:/test");
        try {
            FileUtils.copyDirectory(input, output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
