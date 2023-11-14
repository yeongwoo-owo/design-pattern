package adapter.example.delegate;

import adapter.example.Banner;
import adapter.example.Printer;

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
