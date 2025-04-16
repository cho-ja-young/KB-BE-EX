package Study.src.ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value = 0;

        while (true) {
            System.out.println("-----------------------------");
            System.out.println("1. 증속 | 2. 감속 | 3. 중지");
            System.out.println("-----------------------------");
            System.out.print("선택: ");
            int menu = input.nextInt();

            if (menu == 1) {
                value++;
            }
            else if (menu == 2) {
                value--;
            }
            else if (menu == 3) {
                break;
            }
            System.out.println("현재 속도 = " + value);
        }
        System.out.println("프로그램 종료");

    }
}
