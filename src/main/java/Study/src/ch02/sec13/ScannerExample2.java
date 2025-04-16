package Study.src.ch02.sec13;

import java.util.Scanner;

public class ScannerExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("입력 문자열 : ");
            String data = scanner.nextLine();
            if(data.equals ("q")) {
                break;
            }
            System.out.println("출력 문자열 : " + data);
            System.out.println();
        }
        System.out.println("종료");
    }
}
