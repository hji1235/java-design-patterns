package patterns.prototype.monster;

public class MonsterA implements Monster{

    private String name;

    public MonsterA(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Monster createClone() {
        Monster monster;
        try {
            monster = (Monster) clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return monster;
    }
}
