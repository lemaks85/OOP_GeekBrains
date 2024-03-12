package DZ_1;

public class Arbalester extends HeroySet {
    private int Bolt;
    private int PowerAttack;


    public Arbalester(String name, int hp, int armor) {
        super(name, 150, 100);
        this.Bolt = 15;
        this.PowerAttack = 20;
    }


    @Override
    public String GetInfo() {
        return String.format("Name: %s Hp: %d Armor: %d Bolt:    %d           Class: %s",
                this.Name,
                this.Hp,
                this.Armor,
                this.Bolt,
                this.getClass().getSimpleName());
    }
}
