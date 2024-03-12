package DZ_1;

public class Outlaw extends HeroySet {
    private int PowerAttack;

    public Outlaw(String name, int hp, int armor) {
        super(name, 150, 100);
        this.PowerAttack = 15;

    }

    @Override
    public String GetInfo() {
        return String.format("Name: %s  Hp: %d Armor: %d                       Class: %s",
                this.Name,
                this.Hp,
                this.Armor,
                this.getClass().getSimpleName());
    }
}
