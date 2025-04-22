package adapter.adapter1;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeek();
        p.printStrong();

        // adapter 하나 구현 : 중계하는 역할
        // 자체 로직은 없음
        // 메서드 호출 모양만 바꿔줌
        print(new PrintBanner("Hello Banner!"));
    }

    // 고정된 사용자용 코드
    public static void print(Print p) {
        p.printWeek();
        p.printStrong();
    }
}
