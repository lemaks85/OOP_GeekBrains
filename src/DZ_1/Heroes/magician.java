package DZ_1.Heroes;

import DZ_1.GemeSetting.heroySet;

import java.util.ArrayList;

public class magician extends heroySet {

    private int Mana;
    private int PowerAttack;

    public magician(String name, int hp, int armor, int x, int y) {
        super(name, 150, 100, x, y,1);
        this.Mana = 80;
        this.PowerAttack = 10;
    }

    @Override
    public String toString() {
        return (getClass().getSimpleName() + "---" + Name + "---" + coordinateHero.getX() + ":" + coordinateHero.getY() );
    }


    @Override
    public void step(ArrayList<heroySet> enemies, ArrayList<heroySet> friends) {

    }
}
