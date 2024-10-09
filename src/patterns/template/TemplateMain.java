package patterns.template;

import java.util.ArrayList;
import java.util.List;

public class TemplateMain {
    public static void main(String[] args) {
        String title = "템플릿 메서드";
        List<String> contents = new ArrayList<>();
        contents.add("템템템템템");
        contents.add("플플플플플");
        contents.add("릿릿릿릿릿");
        String footer = "2024.10.10 CMH";

        Article article = new Article(title, contents, footer);

        System.out.println("==== Simple ====");
        DisplayArticleTemplate style1 = new SimpleDisplayArticle(article);
        style1.display();

        System.out.println("==== Caption ====");
        DisplayArticleTemplate style2 = new CaptionDisplayArticle(article);
        style2.display();
    }
}
