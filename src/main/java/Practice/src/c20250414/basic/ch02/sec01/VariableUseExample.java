public class VariableUseExample {
    public static void main(String[] args) {
        int hour = 3;
        int minute = 5;

        System.out.println(hour + "시간 " + minute + "분");

        int totalMinutes = hour * 60 + minute;

        System.out.println("총 " + totalMinutes + "분");
    }
}
