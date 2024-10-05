package patterns.singleton;

public class SingletonMain {

    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();

        if (a == b) {
            System.out.println("a = " + a.hashCode());
            System.out.println("b = " + b.hashCode());
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
