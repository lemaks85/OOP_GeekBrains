package DZ_1.Heroes;

import DZ_1.GemeSetting.heroySet;

import java.util.ArrayList;

public class outlaw extends heroySet {
    private int PowerAttack;

    public outlaw(String name, int hp, int armor, int x, int y) {
        super(name, 150, 100, x, y,2);
        this.PowerAttack = 15;

    }

    @Override
    public String toString() {
        return (getClass().getSimpleName() + "---" + Name + "---"+ coordinateHero.getX() + ":" + coordinateHero.getY());

    }


    @Override
    public void step(ArrayList<heroySet> enemies, ArrayList<heroySet> friends) {

        heroySet target = this.findNearestPerson(enemies);
        if (Hp <= 0 || target == null)
            return;

        if (position.distanceTo(target.position) < 1.5f)
        {
            // бьём
            attack(target, false);
        } else {
            move(target, friends);
            if (position.distanceTo(target.position) < 1.5f)
            {
                // бьём с ходу, с меньшей силой
                attack(target, true);
            }
        }

    }
    }
}
