package patterns.mediator;

import java.util.Scanner;

public class MediatorMain {
    public static void main(String[] args) {
        SmartHome smartHome = new SmartHome();

        // 문 개방
        smartHome.door.open();
        smartHome.report();

        // 에어컨 가동 -> 문 닫힘
        smartHome.aircon.on();
        smartHome.report();

        // 문 개방 -> 에어컨 닫힘
        smartHome.door.open();
        smartHome.report();
    }
}
