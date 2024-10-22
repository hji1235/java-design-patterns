package patterns.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Number {
    private List<Digit> digitList = new ArrayList<>();

    public Number(int number) {
        String string = Integer.toString(number);
        int len = string.length();

        DigitFactory digitFactory = new DigitFactory();
        for (int i = 0; i < len; i++) {
            int n = Character.getNumericValue(string.charAt(i));
            Digit digit = digitFactory.getDigit(n);
            digitList.add(digit);
        }
    }

    public void print(int x, int y) {
        int cntDigits = digitList.size();

        for (int row = 0; row < 5; row++) {
            System.out.print(String.format("%c[%d;%df]", 0x1B, y + row, x));
            for (int i = 0; i < cntDigits; i++) {
                Digit digit = digitList.get(i);
                System.out.print(digit.getData().get(row) + "  ");
            }
            System.out.println();
        }
    }
}
