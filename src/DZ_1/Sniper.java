package DZ_1;

public class Sniper extends HeroySet {
    private int Bullet;
    private int PowerAttack;

    public Sniper(String name, int hp, int armor) {
        super(name, 150, 100);
        this.Bullet = 15;
        this.PowerAttack = 20;
    }

    @Override
    public String GetInfo() {
        return String.format("Name: %s   Hp: %d Armor: %d Bullet:  %d           Class: %s",
                this.Name,
                this.Hp,
                this.Armor,
                this.Bullet,
                this.getClass().getSimpleName());
    }
}
