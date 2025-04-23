package Practice.src.c20250417.basic.ch07.sec07.exam01;

class A {}

class B extends A {}

class C extends A {}

class D extends B {}

class E extends C {}


public class PromotionExample {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a1 = b;
        A a2 = c;
        A a3 = d;
        A a4 = e;

        B b1 = d;
        C c1 = e;

        // B b3 = e;
        // C c2 = d;
    }
}

/* B b3 = e; 와 C c2 = d; 에서 컴파일 에러가 발생 한다
-> 상속 관계에 있지 않기 때문이다
 */