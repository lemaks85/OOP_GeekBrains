package DZ_1;

public class Magician extends HeroySet {

    private int Mana;
    private int PowerAttack;

    public Magician(String name, int hp, int armor) {
        super(name, 150, 100);
        this.Mana = 80;
        this.PowerAttack = 10;
    }

    @Override
    public String GetInfo() {
        return String.format("Name: %s    Hp: %d Armor: %d Mana:    %d           Class: %s",
                this.Name,
                this.Hp,
                this.Armor,
                this.Mana,
                this.getClass().getSimpleName());
    }
}
