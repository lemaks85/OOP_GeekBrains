package DZ_1.Heroes;

import DZ_1.GemeSetting.heroySet;

import java.util.ArrayList;

public class peasant extends heroySet {


    private int Bullet;
    private int Bolt;


    public peasant(String name, int hp, int armor, int bullet, int bolt, int x, int y) {
        super(name, 150, 100, x, y,0);
        this.Name = name;
        this.Bullet = bullet;
        this.Bolt = bolt;
    }


    @Override
    public String toString() {
        return (getClass().getSimpleName() + "---" + Name + "---" + coordinateHero.getX() + ":" + coordinateHero.getY());

    }


    @Override
    public void step(ArrayList<heroySet> enemies, ArrayList<heroySet> friends) {

    }
}