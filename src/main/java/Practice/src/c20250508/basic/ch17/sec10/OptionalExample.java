package Practice.src.c20250508.basic.ch17.sec10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        double avg;

        // 평균
        OptionalDouble optional = list.stream()
                .mapToInt(Integer::intValue)
                .average();
        if(optional.isPresent()) {
            avg = optional.getAsDouble();
            System.out.println("평균: " + avg);
        } else {
            avg = 0.0;
            System.out.println("평균: " + avg);
        }
    }
}
