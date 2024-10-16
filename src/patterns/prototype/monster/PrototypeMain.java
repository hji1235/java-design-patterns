package patterns.prototype.monster;

public class PrototypeMain {
    public static void main(String[] args) {
        MonsterMaker maker = new MonsterMaker(new MonsterRegistry());
        MonsterA monsterA = new MonsterA("A");
        MonsterB monsterB = new MonsterB("B");
        maker.register(monsterA);
        maker.register(monsterB);

        Monster monsterAClone = maker.create("A");
        Monster monsterBClone = maker.create("B");
    }
}
