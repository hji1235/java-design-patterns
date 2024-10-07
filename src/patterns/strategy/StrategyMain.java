package patterns.strategy;

public class StrategyMain {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Item itemA = new Item("itemA", 1000);
        Item itemB = new Item("itemB", 2000);

        shoppingCart.addItem(itemA);
        shoppingCart.addItem(itemB);

        shoppingCart.pay(new KAKAOCardStrategy("choi min hyun", "123345567", "123", "12/01"));
        shoppingCart.pay(new LUNACardStrategy("hji1235@naver.com", "456456"));
    }
}
