package patterns.mediator;

public class SmartHome implements Mediator{
    public Door door = new Door(this);
    public Window window = new Window(this);
    public Boiler boiler = new Boiler(this);
    public Aircon aircon = new Aircon(this);
    @Override
    public void participantChange(Participant participant) {
        if (participant == door && !door.isClosed()) {
            aircon.off();
            boiler.off();
        }

        if (participant == window && !window.isClosed()) {
            aircon.off();
            boiler.off();
        }

        if (participant == aircon && aircon.isRunning()) {
            boiler.off();
            window.close();
            door.close();
        }

        if (participant == boiler && boiler.isRunning()) {
            aircon.off();
            window.close();
            door.close();
        }
    }

    public void report() {
        System.out.println("집 상태");
        System.out.println(door);
        System.out.println(window);
        System.out.println(boiler);
        System.out.println(aircon);
        System.out.println();
    }
}
