package adapter.exercise2.delegate;

import adapter.exercise2.AstreBanner;
import adapter.exercise2.ParanBanner;
import adapter.exercise2.Printer;

public class Main {
    public static void main(String[] args) {
        String input = "Hello";

        Printer printParan = new PrintBannerDelegate(new ParanBanner(input));
        printParan.print();

        // (Hello)

        Printer printAstre = new PrintBannerDelegate(new AstreBanner(input));
        printAstre.print();

        // *Hello*
    }
}
