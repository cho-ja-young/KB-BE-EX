package Practice.src.c20250423.basic.ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
    public static void printLength(String data) {
        int result = data.length();
        System.out.println("문자 수: " + result);
    }
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("[프로그램 종료]");
    }
}

/*
문제점 : NullPointerException 처리에 대한 예외처리문이 작성되어 있지 않다

결과 :  에러 발생!
 */