package patterns.bridge;

public class BridgeMain {
    public static void main(String[] args) {
        String title = "복원된 지구";
        String author = "김형준";
        String[] content = {"플라스틱 사용의 감소", "바다 생물 어획량 감소", "지구는 복원되었다."};

        // 간단 출력
        Draft draft = new Draft(title, author, content);
        Display simpleDisplay = new SimpleDisplay();
        draft.print(simpleDisplay);

        // 캡션 출력
        Display captionDisplay = new CaptionDisplay();
        draft.print(captionDisplay);

        String publisher = "북약출판";
        int cost = 1000;

        // 확장된 기능으로 간단 및 캡션 출력
        Draft publication = new Publication(title, author, content, publisher, cost);
        publication.print(simpleDisplay);
        publication.print(captionDisplay);
    }
}
