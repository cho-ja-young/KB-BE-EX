package Practice.src.c20250423.basic.ch12.sec04;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {
    public static void main(String[] args) {
        String osName = System.getProperty("os.name");
        String userName = System.getProperty("user.name");
        String userHome = System.getProperty("user.home");

        System.out.println("운영체제: " + osName);
        System.out.println("사용자 이름: " + userName);
        System.out.println("홈 디렉토리: " + userHome);

        System.out.println("-----------------------------------");
        System.out.println("key                                 : value");
        System.out.println("-----------------------------------");

        Properties prop = System.getProperties();
        Set<?> keys = prop.keySet();

        for (Object objKey : keys) {
            String key = (String) objKey;
            String value = System.getProperty(key);
            System.out.printf("%-40s: %s\n", key, value);
        }
    }
}
