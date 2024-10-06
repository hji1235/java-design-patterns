package patterns.factory.factorymethod;

public class FactoryMethodMain {
    public static void main(String[] args) {
        CoffeeFactory latteFactory = new LatteFactory();
        Coffee coffee1 = latteFactory.createCoffee();
        System.out.println("coffee1.getName() = " + coffee1.getName()); // latte

        CoffeeFactory espressoFactory = new EspressoFactory();
        Coffee coffee2 = espressoFactory.createCoffee();
        System.out.println("coffee2.getName() = " + coffee2.getName()); // espresso
    }
}
