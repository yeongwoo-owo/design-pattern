package adapter.appendix;

public class Configuration {
    public Printer getPrinter() {
        return new PrintBanner(new Banner());
    }
}
