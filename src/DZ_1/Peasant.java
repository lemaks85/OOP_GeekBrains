package DZ_1;

public class Peasant extends HeroySet {


    private int Bullet;
    private int Bolt;


    public Peasant(String name, int hp, int armor, int bullet, int bolt, int x, int y) {
        super(name, 150, 100, x, y);
        this.Name = name;
        this.Bullet = bullet;
        this.Bolt = bolt;
    }


    @Override
    public String toString() {
        return (getClass().getSimpleName() + "---" + Name + "---" + coordinateHero.x + ":" + coordinateHero.y);
//        return String.format("Name: %s Hp: %d Armor: %d Bullet: %d Class: %s",
//                this.Name,
//                this.Hp,
//                this.Armor,
//                this.Bullet,
//                this.getClass().getSimpleName());
    }
}