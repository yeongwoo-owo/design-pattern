package adapter.exercise2.delegate;

import adapter.exercise2.Banner;
import adapter.exercise2.Printer;

public class PrintBannerDelegate implements Printer {
    private final Banner banner;

    public PrintBannerDelegate(Banner banner) {
        this.banner = banner;
    }

    @Override
    public void print() {
        System.out.println(banner.formattedString());
    }
}
