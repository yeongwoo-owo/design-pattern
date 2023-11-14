package adapter.exercise1.inheritance;

import adapter.exercise1.Printer;

// 다중 상속이 불가능하기 때문에 Banner를 상속받을 수 없다.
public class PrintBanner extends Printer {
    @Override
    public void print() {
        super.print();
        // stringWithDecoration();
    }
}
