package Study.src.ch05.sec13;

public class GradeExample {
    public static void main(String[] args) {
        // 어디서든지 접근가능한 메서드를 정적 메모리에 할당하겠다
        // 이름이 main, jvm 실행하면 자동으로 호출

        Grade myGrade = Grade.B;

        System.out.println("myGrade = " + myGrade);
        System.out.println("점수 : " + myGrade.getScore());
        System.out.println("설명 : " + myGrade.getDescription());

    }
}
