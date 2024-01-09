package template_method.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<AbstractDisplay> displays = List.of(
                new CharDisplay('H'),
                new StringDisplay("Hello, world")
        );

        showDisplay(displays);
    }

    private static void showDisplay(List<AbstractDisplay> displays) {
        displays.forEach(AbstractDisplay::display);
    }
}
