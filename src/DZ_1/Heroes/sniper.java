package DZ_1.Heroes;

import DZ_1.GemeSetting.heroySet;

import java.util.ArrayList;

public class sniper extends heroySet {
    private int Bullet;
    private int PowerAttack;

    public sniper(String name, int hp, int armor, int x, int y) {
        super(name, 150, 100, x, y,3);
        this.Bullet = 15;
        this.PowerAttack = 20;
    }

    @Override
    public String toString() {
        return (getClass().getSimpleName() + "---" + Name + "---" + coordinateHero.getX() + ":" + coordinateHero.getY());

    }


    @Override
    public void step(ArrayList<heroySet> enemies, ArrayList<heroySet> friends) {

    }
}
