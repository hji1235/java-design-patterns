package patterns.flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Digit {
    private List<String> data = new ArrayList<>();

    public Digit(String fileName) {
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);
            for (int i = 0; i < 5; i++) {
                data.add(br.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) fr.close();
                if (br != null) br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public List<String> getData() {
        return data;
    }
}
