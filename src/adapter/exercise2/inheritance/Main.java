package adapter.exercise2.inheritance;

import adapter.exercise2.Printer;

public class Main {
    public static void main(String[] args) {
        String input = "Hello";

        Printer printParan = new PrintParanBannerInheritance(input);
        printParan.print();

        // (Hello)

        Printer printAstre = new PrintAstreBannerInheritance(input);
        printAstre.print();

        // *Hello*
    }
}
