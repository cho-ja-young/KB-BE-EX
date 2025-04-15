//package ch05.sec04;
//
//public class NullPointerExceptionExample {
//    public static void main(String[] args) {
//        int[] intArray = null;
//        intArray[0] = 10;
//
//        String str = null;
//        System.out.println("총 문자 수 : " + str.length());
//    }
//    }
//}
// 잘못된 부분 : intArray를 null로 설정한 상태에서 객체의 데이터를 사용하려 했기 때문에
// NullPointerException 이 일어납니다