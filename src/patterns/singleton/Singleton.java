package patterns.singleton;

public class Singleton {

    private Singleton() {}

    private static class SingletonInstanceHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonInstanceHolder.INSTANCE;
    }
}
