package adapter.exercise1;

public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public String decorate() {
        return "(" + string + ")";
    }
}