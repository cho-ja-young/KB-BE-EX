package Practice.src.c20250510.hard.ch18.sec11;

import java.io.File;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample2 {
    public static void main(String[] args) throws Exception {
        File imageDir = new File("C:/temp/images");

        if (!imageDir.exists()) {
            imageDir.mkdir();
        }

        File temp = new File("C:/temp");
        File[] contents = temp.listFiles();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");

        for (File file : contents) {
            String typeSize = file.isDirectory() ? "<DIR>" : file.length() + "";
            String date = sdf.format(new Date(file.lastModified()));

            System.out.printf("%-25s %-10s %-20s%n", date, typeSize, file.getName());
        }

    }
}