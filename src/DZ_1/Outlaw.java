package DZ_1;

public class Outlaw extends HeroySet {
    private int PowerAttack;

    public Outlaw(String name, int hp, int armor, int x, int y) {
        super(name, 150, 100, x, y);
        this.PowerAttack = 15;

    }

    @Override
    public String toString() {
        return (getClass().getSimpleName() + "---" + Name + "---"+ coordinateHero.x + ":" + coordinateHero.y);
//        return String.format("Name: %s Hp: %d Armor: %d Class: %s",
//                this.Name,
//                this.Hp,
//                this.Armor,
//                this.getClass().getSimpleName());
    }
}
