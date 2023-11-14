package adapter.example;

public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public String formattedString() {
        return "(" + string + ")";
    }
}
