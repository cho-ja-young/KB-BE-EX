package Study.src.ch16.exam1;

public class Person {
    // 매개변수로 Workable 인터페이스를 구현한 객체를 전달받음
    public void action(Workable workable) {
        workable.work();
    }


}
