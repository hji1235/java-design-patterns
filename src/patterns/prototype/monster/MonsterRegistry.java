package patterns.prototype.monster;

import java.util.HashMap;
import java.util.Map;

public class MonsterRegistry {
    private Map<String, Monster> registry;

    public MonsterRegistry() {
        this.registry = new HashMap<>();
    }

    public void register(Monster monster) {
        registry.put(monster.getName(), monster);
    }

    public Monster getMonster(String monsterName) {
        return registry.get(monsterName);
    }
}
