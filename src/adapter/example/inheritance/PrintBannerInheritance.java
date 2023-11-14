package adapter.example.inheritance;

import adapter.example.Banner;
import adapter.example.Printer;

public class PrintBannerInheritance extends Banner implements Printer {
    public PrintBannerInheritance(String string) {
        super(string);
    }

    @Override
    public void print() {
        System.out.println(formattedString());
    }
}
