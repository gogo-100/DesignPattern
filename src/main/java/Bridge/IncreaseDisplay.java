package Bridge;

import java.util.Random;

public class IncreaseDisplay extends Display {
    public IncreaseDisplay(DisplayImpl impl) {
        super(impl);
    }
    public void increaseDisplay(int times) {
        for (int i = 0; i < times; i++) {
            open();
            for (int j = 0; j < i; j++) {
                print();
            }
            close();
            System.out.println();
        }
    }
}