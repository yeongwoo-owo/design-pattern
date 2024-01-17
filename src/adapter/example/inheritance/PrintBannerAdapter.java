package adapter.example.inheritance;

import adapter.example.Banner;
import adapter.example.Printer;

public class PrintBannerAdapter extends Banner implements Printer {
    public PrintBannerAdapter(String string) {
        super(string);
    }

    @Override
    public void print() {
        System.out.println(decorate());
    }
}
