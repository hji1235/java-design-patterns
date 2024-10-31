package patterns.command.ex1;

public class CommandMain {
    public static void main(String[] args) {
        ColorCommand colorCommand = new ColorCommand(ColorCommand.Color.GREEN);
        colorCommand.run();

        PrintCommand printCommand = new PrintCommand("abc");
        printCommand.run();

        MoveCommand moveCommand = new MoveCommand(100, 5);
        moveCommand.run();

        printCommand.run();
    }
}
