package DZ_1.Heroes;

import DZ_1.GemeSetting.heroySet;

import java.util.ArrayList;

public class spearmen extends heroySet {
    private int PowerAttack;

    public spearmen(String name, int hp, int armor, int x, int y) {
        super(name, 150, 100, x, y,2);
        this.PowerAttack = 25;
    }

    @Override
    public String toString() {
        return (getClass().getSimpleName() + "---" + Name + "---" + coordinateHero.getX() + ":" + coordinateHero.getY());

    }


    @Override
    public void step(ArrayList<heroySet> enemies, ArrayList<heroySet> friends) {

    }
}
