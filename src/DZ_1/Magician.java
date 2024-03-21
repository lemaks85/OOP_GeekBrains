package DZ_1;

public class Magician extends HeroySet {

    private int Mana;
    private int PowerAttack;

    public Magician(String name, int hp, int armor, int x, int y) {
        super(name, 150, 100, x, y);
        this.Mana = 80;
        this.PowerAttack = 10;
    }

    @Override
    public String toString() {
        return (getClass().getSimpleName() + "---" + Name + "---" + coordinateHero.x + ":" + coordinateHero.y );
    }
}
