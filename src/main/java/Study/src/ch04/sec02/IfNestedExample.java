package Study.src.ch04.sec02;

public class IfNestedExample {
    public static void main(String[] args) {
        int score = 86;
        System.out.println("점수: " + score);

        String grade = "";
        if (score >= 90) {
            grade = "A";
            if (score >= 95) {
                grade = "A+";
            }
        }
        else if (score >= 80) {
            grade = "B";
            if (score >= 85) {
                grade = "B+";
            }
        }

        System.out.println("학점: " + grade);
    }
}
