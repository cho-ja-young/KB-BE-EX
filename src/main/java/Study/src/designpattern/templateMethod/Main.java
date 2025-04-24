package Study.src.designpattern.templateMethod;

public class Main {
    public static void main(String[] args) {
        AbstractDiaplay d1 = new CharDisplay('H');
        AbstractDiaplay d2 = new StringDisplay("Hello, world.");

        d1.display();
        d2.display();
    }
}
