package adapter.exercise2;

public class ParanBanner implements Banner {
    private final String string;

    public ParanBanner(String string) {
        this.string = string;
    }

    @Override
    public String formattedString() {
        return "(" + string + ")";
    }
}
