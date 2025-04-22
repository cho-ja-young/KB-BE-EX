package adapter.adapter2;

import adapter.adapter1.Banner;

public class PrintBanner extends Print {
    private Banner banner; // 위임 객체

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeek() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
