package adapter.exercise2.inheritance;

import adapter.exercise2.AstreBanner;
import adapter.exercise2.Printer;

public class PrintAstreBannerInheritance extends AstreBanner implements Printer {
    public PrintAstreBannerInheritance(String string) {
        super(string);
    }

    @Override
    public void print() {
        System.out.println(formattedString());
    }
}
