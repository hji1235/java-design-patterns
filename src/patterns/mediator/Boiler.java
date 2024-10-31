package patterns.mediator;

public class Boiler extends Participant{
    private boolean off = true;
    public Boiler(Mediator mediator) {
        super(mediator);
    }

    public void on() {
        if (!off) return;

        off = false;
        mediator.participantChange(this);
    }

    public void off() {
        if (off) return;

        off = true;
        mediator.participantChange(this);
    }

    public boolean isRunning() {
        return !off;
    }

    @Override
    public String toString() {
        if (off) return "# 보일러 : 꺼짐";
        else return "# 보일러 : 켜짐";
    }
}
