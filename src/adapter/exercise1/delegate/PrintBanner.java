package adapter.exercise1.delegate;

import adapter.exercise1.Banner;
import adapter.exercise1.Printer;

public class PrintBanner extends Printer {
    private final Banner banner;

    public PrintBanner(Banner banner) {
        this.banner = banner;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(banner.formattedString());
    }
}
