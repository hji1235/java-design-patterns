package patterns.facade;

public class FacadeMain {
    public static void main(String[] args) {
        Facade facade = new Facade();
        String name = "cmh1";

        facade.run(name);

    }
}
