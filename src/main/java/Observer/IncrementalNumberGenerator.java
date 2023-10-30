package Observer;
import java.util.Random;

public class IncrementalNumberGenerator extends NumberGenerator {
    private int start;
    private int end;
    private int step;
    private int number;                     // 当前数值
    public IncrementalNumberGenerator(int start, int end, int step){
        this.start = start;
        this.end = end;
        this.step = step;
    }
    public int getNumber() {                // 获取当前数值
        return number;
    }
    public void execute() {
        for (int i = start; i < end; i += step) {
            number = i;
            notifyObservers();
        }
    }
}
