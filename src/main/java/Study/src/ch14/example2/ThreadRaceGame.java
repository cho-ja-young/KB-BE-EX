package Study.src.ch14.example2;

public class ThreadRaceGame {
    public static final int RACE_DISTANCE = 20; // 경주거리
    public static boolean gameFinished = false; // 게임 종료 여부

    public static void main(String[] args) {
        System.out.println("🔥🔥!!!경주 시작!!!🔥🔥");

        // 레이서 객체 4개 생성
        Thread racer1 = new Thread(new Racer("지호"), "[지호 스레드]");
        Thread racer2 = new Thread(new Racer("지함"), "[지함 스레드]");
        Thread racer3 = new Thread(new Racer("유민"), "[유민 스레드]");
        Thread racer4 = new Thread(new Racer("자영"), "[자영 스레드]");

        // 각 스레드 시작
        racer1.start();
        racer2.start();
        racer3.start();
        racer4.start();

        System.out.println("### 경기 종료###");

        try {
            racer1.join();
            racer2.join();
            racer3.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 경주 진행 상황 시각화
    public static synchronized void printRaceProgress(String name, int position) {
        int adjustedPosition = Math.min(position, RACE_DISTANCE);
        System.out.print(name + ": ");

        String icon = null;
        switch (name){
            case "[지호 스레드]" : icon = "🐱‍👤"; break;
            case "[지함 스레드]" : icon = "🐸"; break;
            case "[유민 스레드]" : icon = "🐧"; break;
            case "[자영 스레드]" : icon = "🐰"; break;
        }

        for (int i = 0; i < RACE_DISTANCE; i++) {
            if (i <= adjustedPosition) {
                System.out.print(icon);  // 이동한 거리
            } else {
                System.out.print("⬜");  // 남은 거리
            }
        }
        System.out.println(" " + adjustedPosition + "/" + RACE_DISTANCE);
    }
}
