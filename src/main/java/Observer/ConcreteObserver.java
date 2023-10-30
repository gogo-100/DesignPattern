package Observer;

public class ConcreteObserver implements Observer {
    public void update(NumberGenerator generator) {
        System.out.println("Concrete:" + generator.getNumber());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}
