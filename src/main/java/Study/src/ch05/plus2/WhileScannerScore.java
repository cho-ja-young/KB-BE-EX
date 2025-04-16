package Study.src.ch05.plus2;

import java.util.Scanner;

public class WhileScannerScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int stdNum = 0;
        int maxScore = 0;
        double avgScore = 0.0;
        int [] scores = new int[100];
        int sum = 0;

        while(run) {
            System.out.println("-----------------------------------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("-----------------------------------------------------");
            System.out.print("선택> ");

            String input = sc.nextLine(); // 키보드 입력 내용 읽기

            if (input.equals("1")) {
                System.out.print("학생수> ");
                stdNum = sc.nextInt();
                sc.nextLine(); // 엔터 비우기
                System.out.println();
            } else if (input.equals("2")) {
                if (stdNum == 0) {
                    System.out.println("학생 수를 입력하지 않았습니다.");
                } else {
                    for (int i = 0; i < stdNum; i++) {
                        System.out.print("scores[" + i + "]> ");
                        scores[i] = sc.nextInt();
                    }
                    sc.nextLine(); // 엔터 비우기

                }
                System.out.println();
            } else if (input.equals("3")) {
                for (int i = 0; i < stdNum; i++) {
                    System.out.println("scores[" + i + "]: " + scores[i]);
                }
                System.out.println();
            } else if (input.equals("4")) {
                for (int i = 0; i < stdNum; i++) {
                    maxScore = Math.max(maxScore, scores[i]);
                }
                for (int i = 0; i < stdNum; i++) {
                    sum += scores[i];
                }
                avgScore = sum / (double)stdNum;
                System.out.println("최고 점수: " + maxScore);
                System.out.println("평균 점수: " + avgScore);
                System.out.println();
            } else if (input.equals("5")) {
                run = false;
                System.out.println();
            }
        }
        System.out.println("프로그램 종료");
    }
}
