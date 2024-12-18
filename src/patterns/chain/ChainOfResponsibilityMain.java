package patterns.chain;

public class ChainOfResponsibilityMain {
    public static void main(String[] args) {
        Handler handler1 = new ProtocolHandler();
        Handler handler2 = new DomainHandler();
        Handler handler3 = new PortHandler();
        handler1.setNext(handler2).setNext(handler3);

        String url = "http://www.youtube.com:1007";
        handler1.run(url);
    }
}
