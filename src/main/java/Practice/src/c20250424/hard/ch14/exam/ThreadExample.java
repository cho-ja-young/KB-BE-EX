package Practice.src.c20250424.hard.ch14.exam;

public class ThreadExample {
    public static void main(String[] args) {
        // MovieThread는 Thread를 상속한 클래스
        Thread movieThread = new Thread();

        // MusicRunnable은 Runnable을 구현한 클래스이므로 Thread로 감싸줘야 함
        Runnable musicRunnable = new MusicRunnable();
        Thread musicThread = new Thread(musicRunnable);

        // 두 스레드 동시에 시작
        movieThread.start();
        musicThread.start();
    }
}