package Study.src.ch04.plus2;

import java.util.Scanner;

public class WhileScannerBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int money = 0;
        int balance = 0;

        while(run) {
            System.out.println("-----------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("-----------------------------------");
            System.out.print("선택> ");

            String input = sc.nextLine(); // 키보드 입력 내용 읽기

            if (input.equals("1")) {
                System.out.print("예금액> ");
                money = sc.nextInt();
                sc.nextLine(); // 엔터 비우기
                // money = Integer.parseInt(sc.nextLine());
                balance += money;
                System.out.println();
            } else if (input.equals("2")) {
                System.out.print("출금액> ");
                money = sc.nextInt();
                sc.nextLine(); // 엔터 비우기
                // money = Integer.parseInt(sc.nextLine());
                balance -= money;
                System.out.println();
            } else if (input.equals("3")) {
                System.out.println("잔고> " + balance);
                System.out.println();
            } else if (input.equals("4")) {
                run = false;
                System.out.println();
            }
        }
        System.out.println("프로그램 종료");
    }
}
