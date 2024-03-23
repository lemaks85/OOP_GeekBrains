package DZ_1.Heroes;

import DZ_1.GemeSetting.heroySet;
import DZ_1.GemeSetting.coordinateHero;

import java.util.ArrayList;

public class arbalester extends heroySet {
    private int Bolt;
    private int PowerAttack;


    public arbalester(String name, int hp, int armor, int x, int y) {
        super(name, 150, 100, x, y, 3);
        this.Bolt = 15;
        this.PowerAttack = 20;
    }


    @Override
    public String toString() {
        return (getClass().getSimpleName() + "---" + Name + "---"+ coordinateHero.getX()+ ":" + coordinateHero.getY());
    }
    protected void shot(heroySet target)
    {
        Bolt--;


    }
    @Override
    public void step(ArrayList<heroySet> enemies, ArrayList<heroySet> friends) {
        if (Hp <= 0 || Bolt <= 0)
        {
//            if (ammo <= 0)
//            {
//                System.out.print(name + ": " + "подайте стрел!");
//            }
            return;
        }
        heroySet target = this.findNearestPerson(enemies);
        if (target != null)
        {
            shot(target);
        }
    }
    }

