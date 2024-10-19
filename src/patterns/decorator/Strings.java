package patterns.decorator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Strings extends Item {

    private List<String> strings = new ArrayList<>();

    public void add(String item) {
        strings.add(item);
    }

    @Override
    public int getLinesCount() {
        return strings.size();
    }

    @Override
    public int getMaxLength() {
        Iterator<String> iter = strings.iterator();
        int maxWidth = 0;

        while (iter.hasNext()) {
            String string = iter.next();
            maxWidth = Integer.max(maxWidth, string.length());
        }
        return maxWidth;
    }

    @Override
    public int getLength(int index) {
        String string = strings.get(index);
        return string.length();
    }

    @Override
    public String getString(int index) {
        return strings.get(index);
    }
}
