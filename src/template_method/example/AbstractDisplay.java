package template_method.example;

public abstract class AbstractDisplay {
    public abstract void open();
    public abstract void print();
    public abstract void close();

    // final 선언 -> 하위 클래스에서 display에 대한 로직을 변경하는 것을 방지
    // final을 제거하면 특정 디스플레이에 다른 로직이 필요한 경우 변경할 수 있다.
    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
