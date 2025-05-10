package Practice.src.c20250510.basic.ch18.sec03.exam03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.stream.IntStream;

public class CopyExample {
    public static void main(String[] args) throws Exception{
        String originalFilename = "C:/Temp/test.jpg";
        String targetFilename = "C:/Temp/test2.jpg";

        try (
                InputStream is = new FileInputStream(originalFilename);
                OutputStream os = new FileOutputStream(targetFilename);
        ) {
            byte[] data = new byte[1024];
            while (true) {
                int num = is.read(data);
                if (num == -1) break;
                os.write(data, 0, num);
            }
            os.flush();
            System.out.println("복사가 잘 되었습니다.");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
