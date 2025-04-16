package ch05.plus;

public class MaxInArray {
    public static void main(String[] args) {
        int [] array = {1,5,3,8,2};
        int maxNum = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNum) {
                maxNum = array[i];
            }
        }
        System.out.println(maxNum);
    }
}
