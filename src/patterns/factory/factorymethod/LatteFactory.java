package patterns.factory.factorymethod;

public class LatteFactory extends CoffeeFactory{
    @Override
    Coffee createCoffee() {
        return new Latte();
    }
}
