package patterns.status;

public class DraftState implements State{
    @Override
    public void publish(Document document) {
        System.out.println("publishing document...");
        document.setState(new PublishedState());
    }

    @Override
    public void render(Document document) {
        System.out.println("Rendering document as draft.");
    }
}
