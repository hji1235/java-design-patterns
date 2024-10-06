package patterns.factory.factorymethod;

public class EspressoFactory extends CoffeeFactory{
    @Override
    Coffee createCoffee() {
        return new Espresso();
    }
}
