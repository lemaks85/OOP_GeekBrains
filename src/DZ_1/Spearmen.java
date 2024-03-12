package DZ_1;

public class Spearmen extends HeroySet {
    private int PowerAttack;

    public Spearmen(String name, int hp, int armor) {
        super(name, 150, 100);
        this.PowerAttack = 25;
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
