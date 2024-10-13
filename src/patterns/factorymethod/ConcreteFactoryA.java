package patterns.factorymethod;

public class ConcreteFactoryA extends AbstractFactory{
    @Override
    protected Product createProduct() {
        return new ConcreteProductA();
    }
}
