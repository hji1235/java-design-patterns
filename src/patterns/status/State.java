package patterns.status;

public interface State {
    void publish(Document document);
    void render(Document document);
}
