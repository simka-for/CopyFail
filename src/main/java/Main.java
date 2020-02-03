import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {
    public static void main(String[] args) {

        File input = new File("D:/spisok");
        File output = new File("D:/test");

        try {
            FileUtils.copyDirectory(input, output);
        } catch (IOException e) {
            e.printStackTrace();
        }


//        try {
//            copyDirect(input, output);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private static void copyDirect(File input, File output) throws IOException {
//        File folder = new File(String.valueOf(input));
//        File[] listOfFiles = folder.listFiles();
//        Path destDir = Paths.get(String.valueOf(output));
//
//        if (listOfFiles != null) {
//            if (!Files.exists(destDir)) {
//                new File(String.valueOf(output)).mkdir();
//            }
//            for (File file : listOfFiles)
//                Files.copy(file.toPath(), destDir.resolve(file.getName()), StandardCopyOption.REPLACE_EXISTING);
//        }
//    }
    }
}

