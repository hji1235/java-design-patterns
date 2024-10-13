package patterns.factorymethod;

public class ConcreteFactoryB extends AbstractFactory{
    @Override
    protected Product createProduct() {
        return new ConcreteProductB();
    }
}
