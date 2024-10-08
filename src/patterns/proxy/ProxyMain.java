package patterns.proxy;

public class ProxyMain {
    public static void main(String[] args) {
        Service service = new ProxyService();
        service.request();
    }
}
