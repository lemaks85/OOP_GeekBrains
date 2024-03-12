package DZ_1;

public class Peasant extends HeroySet {

    private String Name;
    private int Bullet;
    private int Bolt;


    public Peasant(String name, int hp, int armor, int bullet, int bolt) {
        super(name, 150, 100);
        this.Name = name;
        this.Bullet = bullet;
        this.Bolt = bolt;
    }


    @Override
    public String GetInfo() {
        return String.format("Name: %s    Hp: %d Armor: %d Bullet:  %d Bolt: %d  Class: %s",
                this.Name,
                this.Hp,
                this.Armor,
                this.Bullet,
                this.Bolt,
                this.getClass().getSimpleName());
    }
}
