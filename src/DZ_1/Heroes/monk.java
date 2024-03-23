package DZ_1.Heroes;

import DZ_1.GemeSetting.heroySet;

import java.util.ArrayList;

public class monk extends heroySet {
    private int Elixir;
    private int Healing;

    public monk(String name, int hp, int armor, int x, int y) {
        super(name, 150, 100, x, y,1);
        this.Elixir = 80;
        this.Healing = 300;

    }

    @Override
    public String toString() {
        return (getClass().getSimpleName() + "---" + Name +  "---" + coordinateHero.getX() + ":" + coordinateHero.getY());

    }


    @Override
    public void step(ArrayList<heroySet> enemies, ArrayList<heroySet> friends) {

    }
}





