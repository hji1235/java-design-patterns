package patterns.adapter;

public class Tiger {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    void roar() {
        System.out.println(" 어흥");
    }
}
