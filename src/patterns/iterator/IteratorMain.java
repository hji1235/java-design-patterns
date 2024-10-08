package patterns.iterator;

import java.util.ArrayList;

public class IteratorMain {
    public static void main(String[] args) {
        ConcreteAggregate aggregate = new ConcreteAggregate(5);
        aggregate.add(1);
        aggregate.add(2);
        aggregate.add(3);
        aggregate.add(4);
        aggregate.add(5);

        Iterator iterator1 = aggregate.iterator();

        while (iterator1.hasNext()) {
            System.out.printf("%s -> ", iterator1.next());
        }

        // 자바에서 제공하는 이터레이터 패턴 예시
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        java.util.Iterator<Integer> iterator2 = arrayList.iterator();

        while (iterator2.hasNext()) {
            System.out.printf("%d -> ", iterator2.next());
        }
    }
}
