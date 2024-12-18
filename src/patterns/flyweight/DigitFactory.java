package patterns.flyweight;

import java.io.File;

public class DigitFactory {
    private Digit[] pool = new Digit[10];

    public Digit getDigit(int n) {
        if (pool[n] != null) {
            return pool[n];
        } else {
            String fileName = String.format("C:\\Users\\alsgus\\Desktop\\study\\b. 수업프로젝트\\java-design-patterns\\src\\patterns\\flyweight\\data\\%d.txt", n);
            Digit digit = new Digit(fileName);
            pool[n] = digit;
            return digit;
        }
    }
}
