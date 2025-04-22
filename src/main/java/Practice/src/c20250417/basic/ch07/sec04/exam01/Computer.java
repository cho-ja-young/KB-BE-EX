package Practice.src.c20250417.basic.ch07.sec04.exam01;

public class Computer extends Calculator{
    @Override
    public double areaCircle(double r) {
        System.out.println("Computer 객체의 areaCircle(0 실행");
        return Math.PI * r * r;
    }
}
