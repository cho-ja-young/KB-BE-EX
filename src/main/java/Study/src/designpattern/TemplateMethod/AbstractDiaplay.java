package Study.src.designpattern.TemplateMethod;

public abstract class AbstractDiaplay {
    public abstract void open();
    public abstract void print();
    public abstract void close();

    public final void display() {
        open();
        for(int i=0; i<5; i++) {
            print();
        }
        close();
    }
}
