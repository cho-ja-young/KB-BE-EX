package Study.src.ch17.sec12.exam01;

import java.util.ArrayList;
import java.util.List;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> totalList = new ArrayList<>();
        totalList.add(new Student("홍길동", "남", 92));
        totalList.add(new Student("김수영", "여", 87));
        totalList.add(new Student("감자바", "남", 95));
        totalList.add(new Student("오해영", "여", 93));

        List<Student> topList = totalList.stream()
                .sorted((a, b) -> Integer.compare(b.getScore(), a.getScore()))
                .limit(2)
                .toList();

        topList.forEach(System.out::println);

    }
}
