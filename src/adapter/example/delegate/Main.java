package adapter.example.delegate;

import adapter.example.Banner;
import adapter.example.Printer;

public class Main {
    public static void main(String[] args) {
        String input = "Hello";

        Printer printer = new PrintBannerDelegate(new Banner(input));
        printer.print();

        // (Hello)
    }
}
