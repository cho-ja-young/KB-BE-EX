package Practice.src.c20250422.hard.ch09.sec07.exam03;

public class ButtonExample {
    public static void main(String[] args) {
        // ok 버튼 객체 생성
        Button btnOk = new Button();

        // ok 객체 버튼에 ClickListener 구현 객체 주입
        btnOk.setClickListner(new Button.ClickListner() {
            @Override
            public void onClick() {
                System.out.println("Ok 버튼을 클릭했습니다.");
            }
        });

        // ok 버튼 클릭
        btnOk.click();

        // cancel 버튼 객체 생성
        Button btnCancel = new Button();

        // Cancel 버튼 객체에 ClickListener 구현 객체 주입
        btnCancel.setClickListner(new Button.ClickListner() {
            @Override
            public void onClick() {
                System.out.println("Cancel 버튼을 클릭했습니다.");
            }
        });

        // Cancel 버튼 클릭하기
        btnCancel.click();
    }
}
