package patterns.command.ex2;

public class LightOffCommand implements Command{
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }
    @Override
    public void run() {
        light.turnOff();
    }
}
