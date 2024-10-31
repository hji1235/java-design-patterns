package patterns.mediator;

public class Window extends Participant{
    private boolean closed = true;
    public Window(Mediator mediator) {
        super(mediator);
    }

    public void open() {
        if (!closed) return;

        closed = false;
        mediator.participantChange(this);
    }

    public void close() {
        if (closed) return;

        closed = true;
        mediator.participantChange(this);
    }

    public boolean isClosed() {
        return closed;
    }

    @Override
    public String toString() {
        if (closed) return "# 창문 : 닫힘";
        else return "# 창문 : 열림";
    }
}
