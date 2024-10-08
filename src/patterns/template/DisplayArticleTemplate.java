package patterns.template;

public abstract class DisplayArticleTemplate {

    protected Article article;

    protected DisplayArticleTemplate(Article article) {
        this.article = article;
    }

    public final void display() {
        title();
        content();
        if (hook()) {
            footer();
        }
    }

    boolean hook() {
        return true;
    }

    protected abstract void title();
    protected abstract void content();
    protected abstract void footer();
}
