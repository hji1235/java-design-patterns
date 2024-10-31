package patterns.command.ex2;

public class CommandMain {
    public static void main(String[] args) {
        Light light = new Light(); // Receiver
        Command lightOnCommand = new LightOnCommand(light); // concreteCommand
        Command lightOffCommand = new LightOffCommand(light); // concreteCommand

        RemoteControl remote = new RemoteControl(); // Invoker

        remote.setCommand(lightOnCommand);
        remote.pressButton(); // 전등 On

        remote.setCommand(lightOffCommand);
        remote.pressButton(); // 전등 Off
    }
}
