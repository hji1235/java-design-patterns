package patterns.status;

public class PublishedState implements State{
    @Override
    public void publish(Document document) {
        System.out.println("Document is already published.");
    }

    @Override
    public void render(Document document) {
        System.out.println("Rendering document as published.");
    }
}
