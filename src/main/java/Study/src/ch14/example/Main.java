package Study.src.ch14.example;

import java.util.Scanner;

public class Main {
    public static int count = 0;
    public static int finalNumber = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("참가할 인원 수: ");
        finalNumber = sc.nextInt();

        for (int i = 1; i <= finalNumber; i++) {
            new Thread(new Player("플레이어" + i)).start();
        }
    }
}
