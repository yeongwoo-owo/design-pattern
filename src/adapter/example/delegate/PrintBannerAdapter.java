package adapter.example.delegate;

import adapter.example.Banner;
import adapter.example.Printer;

public class PrintBannerAdapter implements Printer {
    private final Banner banner;

    public PrintBannerAdapter(Banner banner) {
        this.banner = banner;
    }

    @Override
    public void print() {
        System.out.println(banner.decorate());
    }
}
