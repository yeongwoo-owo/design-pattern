package adapter.appendix;

public class PrintBanner implements Printer {
    private final Banner banner;

    public PrintBanner(Banner banner) {
        this.banner = banner;
    }

    @Override
    public void print(String input) {
        System.out.println(banner.formattedString(input));
    }
}
