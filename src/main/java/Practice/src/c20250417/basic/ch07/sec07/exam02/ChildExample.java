package Practice.src.c20250417.basic.ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = child;

        parent.method1();
        parent.method2();
        // parent.method3();
    }
}

/*
parent.method3();
-> 호출이 불가능 하기 때문이다
 */