package patterns.bridge;

public class SimpleDisplay implements Display{
    @Override
    public void title(Draft draft) {
        System.out.println(draft.getTitle());
    }

    @Override
    public void author(Draft draft) {
        System.out.println(draft.getAuthor());
    }

    @Override
    public void content(Draft draft) {
        for (String str : draft.getContent()) {
            System.out.println(str);
        }
    }
}
