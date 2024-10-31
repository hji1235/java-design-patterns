package patterns.status;

public class StatusMain {
    public static void main(String[] args) {
        Document document = new Document();

        document.render();
        document.publish();

        document.render();
        document.publish();
    }
}
