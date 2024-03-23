package DZ_1.GemeSetting;

import java.util.ArrayList;

public abstract class heroySet implements moveHero {

    public int priority;
    protected String Name;
    protected int Hp;
    protected int Armor;

    protected DZ_1.GemeSetting.coordinateHero coordinateHero;


    public heroySet(String name, int hp, int armor, int x, int y, int priority) {
        this.Name = name;
        this.Hp = hp;
        this.Armor = armor;
        this.priority = priority;
        this.coordinateHero = new coordinateHero(x, y);
    }
    public abstract String toString();
    public heroySet findNearestPerson(ArrayList<heroySet> persons)
    {
        heroySet target = null;
        float minDistance = Float.MAX_VALUE;

        for (heroySet p : persons)
        {
            if (p.Hp > 0)
            {
                float dist = coordinateHero.distanceTo(p.coordinateHero);
                if (dist < minDistance)
                {
                    minDistance = dist;
                    target = p;
                }
            }
        }
        return target;
    }


}
