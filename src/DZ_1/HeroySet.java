package DZ_1;

import java.util.ArrayList;

public abstract class HeroySet {
    protected String Name;
    protected int Hp;
    protected int Armor;
    protected CoordinateHero coordinateHero;


    public HeroySet(String name, int hp, int armor, int x, int y) {
        this.Name = name;
        this.Hp = hp;
        this.Armor = armor;
        this.coordinateHero = new CoordinateHero(x, y);
    }
    public HeroySet findNearestPerson(ArrayList<HeroySet> persons)
    {
        HeroySet target = null;
        float minDistance = Float.MAX_VALUE;

        for (HeroySet p : persons)
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
