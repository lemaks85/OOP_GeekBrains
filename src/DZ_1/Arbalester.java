package DZ_1;

public class Arbalester extends HeroySet {
    private int Bolt;
    private int PowerAttack;


    public Arbalester(  String name, int hp, int armor, int x, int y) {
        super(name, 150, 100, x, y);
        this.Bolt = 15;
        this.PowerAttack = 20;
    }


    @Override
    public String toString() {
//        return String.format("Name: %s Hp: %d Armor: %d PositionX: %s PositionY: %s Class: %s",
//                this.Name,
//                this.Hp,
//                this.Armor,
//                this.coordinateHero.x,
//                this.coordinateHero.y,
//                this.getClass().getSimpleName());
        return (getClass().getSimpleName() + "---" + Name + "---"+ coordinateHero.x + ":" + coordinateHero.y);


    }
}
