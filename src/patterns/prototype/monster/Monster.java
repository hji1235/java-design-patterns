package patterns.prototype.monster;

public interface Monster extends Cloneable{
    String getName();
    Monster createClone();
}
