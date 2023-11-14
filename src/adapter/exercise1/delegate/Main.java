package adapter.exercise1.delegate;

import adapter.exercise1.Banner;
import adapter.exercise1.Printer;

public class Main {
    public static void main(String[] args) {
        String input = "Hello";

        Printer printer = new PrintBanner(new Banner(input));
        printer.print();
    }
}
