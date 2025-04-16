package ch04.plus;

public class SumOfMultipleOfThree {
    public static void main(String[] args) {
        int sum = 0;

        for (int i=1; i<=100; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
