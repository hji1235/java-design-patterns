package patterns.visitor;

public class VisitorMain {
    public static void main(String[] args) {
        ItemList list1 = new ItemList();
        list1.add(new Item(10));
        list1.add(new Item(20));
        list1.add(new Item(30));

        ItemList list2 = new ItemList();
        list2.add(new Item(40));
        list2.add(new Item(50));
        list1.add(list2);

        SumVisitor sum = new SumVisitor();
        list1.accept(sum);
        System.out.println("합계 : " + sum.getValue());

        AvgVisitor avg = new AvgVisitor();
        list1.accept(avg);
        System.out.println("평균 : " + avg.getValue());
    }
}
