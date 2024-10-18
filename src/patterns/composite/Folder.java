package patterns.composite;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Folder extends Unit{

    private List<Unit> unitList = new LinkedList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator<Unit> iter = unitList.iterator();
        while (iter.hasNext()) {
            Unit unit = iter.next();
            size += unit.getSize();
        }
        return size;
    }

    public boolean add(Unit unit) {
        unitList.add(unit);
        return true;
    }

    private void list(String indent, Unit unit) {
        if (unit instanceof File) {
            System.out.println(indent + unit);
        } else {
            Folder dir = (Folder) unit;
            Iterator<Unit> iter = dir.unitList.iterator();
            System.out.println(indent + "+ " + unit);
            while (iter.hasNext()) {
                list(indent + "    ", iter.next());
            }
        }
    }

    public void list() {
        list("", this);
    }
}
