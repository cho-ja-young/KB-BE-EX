package adapter.adapter1;

/*
class PrintBanner(Adapter) : Banner 클래스의 메서드를
 */
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeek() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
