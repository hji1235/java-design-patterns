package patterns.bridge;

public class CaptionDisplay implements Display{
    @Override
    public void title(Draft draft) {
        System.out.println("타이틀 : " + draft.getTitle());
    }

    @Override
    public void author(Draft draft) {
        System.out.println("저자 : " + draft.getAuthor());
    }

    @Override
    public void content(Draft draft) {
        System.out.println("내용");
        for (String str : draft.getContent()) {
            System.out.println("    " + str);
        }

    }
}
