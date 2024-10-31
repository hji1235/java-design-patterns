package patterns.command.ex1;

public class MoveCommand implements Command{

    private int x;
    private int y;

    public MoveCommand(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void run() {
        System.out.printf("\033[%d;%dH", y, x);
        System.out.flush();
    }
}
