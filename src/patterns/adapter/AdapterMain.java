package patterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterMain {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("강아지"));
        animals.add(new TigerAdapter("호랑이"));

        animals.forEach(animal -> {
            animal.sound();
        });
    }
}
