package patterns.factory.simplefactory;

public class FactoryMain {
    public static void main(String[] args) {
        Coffee coffee1 = CoffeeFactory.createCoffee(CoffeeType.LATTE);
        System.out.println("coffee.getName() = " + coffee1.getName());

        Coffee coffee2 = CoffeeFactory.createCoffee(CoffeeType.ESPRESSO);
        System.out.println("coffee2.getName() = " + coffee2.getName());
    }
}
