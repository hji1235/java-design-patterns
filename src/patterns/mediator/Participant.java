package patterns.mediator;

public abstract class Participant {
    protected Mediator mediator;

    public Participant(Mediator mediator) {
        this.mediator = mediator;
    }
}
