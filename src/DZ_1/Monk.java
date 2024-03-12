package DZ_1;

import javax.naming.Name;

public class Monk extends HeroySet {
    private int Elixir;
    private int Healing;

    public Monk(String name, int hp, int armor) {
        super(name, 150, 100);
        this.Elixir = 80;
        this.Healing = 300;

    }

    @Override
    public String GetInfo() {
        return String.format("Name: %s     Hp: %d Armor: %d Elixir:  %d           Class: %s",
                this.Name,
                this.Hp,
                this.Armor,
                this.Elixir,
                this.getClass().getSimpleName());
    }
}





