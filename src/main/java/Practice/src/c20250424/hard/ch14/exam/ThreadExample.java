package Practice.src.c20250424.hard.ch14.exam;

public class ThreadExample {
    public static void main(String[] args) {
        Thread movieThread = new MovieThread();

        Runnable musicRunnable = new MusicRunnable();
        Thread musicThread = new Thread(musicRunnable);

        // 두 스레드를 동시에 실행
        movieThread.start();
        musicThread.start();
    }
}