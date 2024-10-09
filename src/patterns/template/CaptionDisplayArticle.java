package patterns.template;

import java.util.List;

public class CaptionDisplayArticle extends DisplayArticleTemplate{

    public CaptionDisplayArticle(Article article) {
        super(article);
    }

    @Override
    protected void title() {
        System.out.println("title : " + article.getTitle());
    }

    @Override
    protected void content() {
        System.out.println("contents :");
        List<String> contents = article.getContent();
        for (String str : contents) {
            System.out.println("   " + str);
        }
    }

    @Override
    protected void footer() {
        System.out.println("footer : " + article.getTitle());
    }

    @Override
    protected boolean hook() {
        return false;
    }
}
