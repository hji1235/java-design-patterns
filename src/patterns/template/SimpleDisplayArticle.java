package patterns.template;

import java.util.List;

public class SimpleDisplayArticle extends DisplayArticleTemplate{

    public SimpleDisplayArticle(Article article) {
        super(article);
    }

    @Override
    protected void title() {
        System.out.println(article.getTitle());
    }

    @Override
    protected void content() {
        List<String> contents = article.getContent();
        for (String str : contents) {
            System.out.println(str);
        }
    }

    @Override
    protected void footer() {
        System.out.println(article.getFooter());
    }
}
