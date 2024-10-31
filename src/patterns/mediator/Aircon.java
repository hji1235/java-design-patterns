package patterns.mediator;

public class Aircon extends Participant{
    private boolean off = true;
    public Aircon(Mediator mediator) {
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
        if (off) return "# 에어컨 : 꺼짐";
        else return "# 에어컨 : 켜짐";
    }
}
