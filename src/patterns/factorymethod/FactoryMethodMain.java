package patterns.factorymethod;

public class FactoryMethodMain {
    public static void main(String[] args) {
        AbstractFactory factoryA = new ConcreteFactoryA();
        Product productA = factoryA.createOperation(); // 제품 A

        AbstractFactory factoryB = new ConcreteFactoryB();
        Product productB = factoryB.createOperation(); // 제품 B
    }
}
