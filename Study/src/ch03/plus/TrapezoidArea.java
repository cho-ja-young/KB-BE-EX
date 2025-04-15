package ch03.plus;

public class TrapezoidArea {
    public static void main(String[] args) {
        int upperSide = 5;
        int lowerSide = 10;
        int height = 7;
        double area = (double) ((upperSide + lowerSide) * height) / 2;

        System.out.println("사다리꼴의 넓이 : " + area);
    }
}
