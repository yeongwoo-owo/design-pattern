package template_method.example;

public class NewDisplay extends AbstractDisplay {
    private String string;

    public NewDisplay(String string) {
        this.string = string;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(string);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
