package patterns.memento;

public class MementoMain {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.setText("첫 번째 문장");
        history.save(editor);

        editor.setText("두 번째 문장");
        history.save(editor);

        editor.setText("세 번째 문장");
        history.save(editor);

        history.undo(editor);
        System.out.println("undo 1 : " + editor.getText());

        history.undo(editor);
        System.out.println("undo 2 : " + editor.getText());

        history.undo(editor);
        System.out.println("undo 3 : " + editor.getText());
    }
}
