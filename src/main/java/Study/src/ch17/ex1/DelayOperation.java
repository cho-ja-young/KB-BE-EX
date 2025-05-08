//package Study.src.ch17.ex1;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Stream;
//
//public class DelayOperation {
//    public static void main(String[] args) {
//        /* 지연 연산
//        - 최종 연산이 수행되기 전까지 중간 연산을 실행되지 않음
//         */
//
//        List<String> names = Arrays.asList("신짱구", "훈이", "유리", "김철수");
//
//        // filter, map 은 중간연산
//        Stream<String> stream = names.stream() // 스트림 생성
//            .filter(name -> {
//                System.out.println("filter: " + name);
//                return name.length() > 2;
//            }); // 신짱구, 김철수
//            .map(name -> {
//                System.out.println("map: " + name);
//                return name + "님";
//            });
//
//        Thread.sleep(3000);
//        // 최종연산 호출
//        stream.forEach(System.out::println);
//    }
//}
