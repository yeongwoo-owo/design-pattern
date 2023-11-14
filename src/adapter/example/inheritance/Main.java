package adapter.example.inheritance;

import adapter.example.Printer;

public class Main {
    public static void main(String[] args) {
        String input = "Hello";

        Printer printer = new PrintBannerInheritance(input);
        printer.print();

        // (Hello)
    }
}
