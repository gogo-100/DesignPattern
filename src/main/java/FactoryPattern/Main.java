package FactoryPattern;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("小A");
        Product card2 = factory.create("小B");
        Product card3 = factory.create("小C");
        card1.use();
        card2.use();
        card3.use();
    }
}
