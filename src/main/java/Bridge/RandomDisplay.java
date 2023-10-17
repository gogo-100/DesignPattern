package Bridge;

import java.util.Random;

public class RandomDisplay extends Display {
    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }
    public void randomDisplay(int times) {       // 随机显示少于times的次数
        open();
        Random random = new Random();
        int randomCnt = random.nextInt(times);
        for (int i = 0; i < randomCnt; i++) {
            print();
        }
        close();
    }
}
