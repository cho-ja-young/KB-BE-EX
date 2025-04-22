package Practice.src.c20250422.basic.ch09.sec06.exam03;

import Practice.src.c20250422.basic.ch09.sec06.exam01.Button;

public class ButtonExample {
    public static void main(String[] args) {
        Button btnOk = new Button();

        // OK 버튼 클릭 이벤트를 처리할 ClickListner 구현 클래스(로컬 클래스)
        class OkListner implements Button.ClickListner {
            @Override
            public void onClick() {
                System.out.println("Ok 버튼을 클릭했습니다.");
            }
        }
    }
}
