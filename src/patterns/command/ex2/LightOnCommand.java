package patterns.command.ex2;

public class LightOnCommand implements Command{
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }
    @Override
    public void run() {
        light.turnOn();
    }
}
