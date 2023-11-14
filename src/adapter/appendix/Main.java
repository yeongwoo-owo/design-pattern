package adapter.appendix;

public class Main {
    public static void main(String[] args) {
        // 서버가 시작하는 시점
        Configuration config = new Configuration();

        // 사용자의 요청이 들어오는 시점
        String input = "Hello";
        Printer printer = config.getPrinter();
        printer.print(input);
    }
}
