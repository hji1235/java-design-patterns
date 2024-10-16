package patterns.prototype.monster;

public class MonsterMaker {
    private MonsterRegistry registry;

    public MonsterMaker(MonsterRegistry registry) {
        this.registry = registry;
    }

    public void register(Monster monster) {
        registry.register(monster);
    }

    public Monster create(String monsterName) {
        return registry.getMonster(monsterName).createClone();
    }
}
