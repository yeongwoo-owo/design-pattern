package adapter.exercise2;

public class AstreBanner implements Banner {
    private final String string;

    public AstreBanner(String string) {
        this.string = string;
    }

    @Override
    public String decorate() {
        return "*" + string + "*";
    }
}
