package adapter.exercise2.inheritance;

import adapter.exercise2.ParanBanner;
import adapter.exercise2.Printer;

public class PrintParanBannerInheritance extends ParanBanner implements Printer {
    public PrintParanBannerInheritance(String string) {
        super(string);
    }

    @Override
    public void print() {
        System.out.println(decorate());
    }
}
