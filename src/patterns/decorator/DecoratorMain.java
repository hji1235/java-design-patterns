package patterns.decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Strings strings = new Strings();
        strings.add("hello");
        strings.add("aaaaaaaaa");
        strings.add("bbbbbbbbbbbbbbbbbb");

        strings.print();
        System.out.println();

        Decorator sideDecorator = new SideDecorator(strings, '"');
        sideDecorator.print();
        System.out.println();

        Decorator boxDecorator = new BoxDecorator(strings);
        boxDecorator.print();
        System.out.println();

        Decorator lineNumberDecorator = new LineNumberDecorator(strings);
        lineNumberDecorator.print();
        System.out.println();

        // 데코레이터 조합
        Decorator combinationDecorator = new BoxDecorator(lineNumberDecorator);
        combinationDecorator.print();
    }
}
