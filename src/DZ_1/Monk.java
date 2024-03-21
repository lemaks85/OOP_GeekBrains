package DZ_1;

import javax.naming.Name;

public class Monk extends HeroySet {
    private int Elixir;
    private int Healing;

    public Monk(String name, int hp, int armor, int x, int y) {
        super(name, 150, 100, x, y);
        this.Elixir = 80;
        this.Healing = 300;

    }

    @Override
    public String toString() {
        return (getClass().getSimpleName() + "---" + Name +  "---" + coordinateHero.x + ":" + coordinateHero.y);
//        return String.format("Name: %s Hp: %d Armor: %d Elixir: %d Class: %s",
//                this.Name,
//                this.Hp,
//                this.Armor,
//                this.Elixir,
//                this.getClass().getSimpleName());
    }
}





