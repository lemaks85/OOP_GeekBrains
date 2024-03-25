package DZ_1.GemeSetting;

import java.util.ArrayList;

public abstract class shooterSet extends heroySet{
    protected int ammo;
    protected int level;
    protected int effectiveDistance;


    protected shooterSet(String name, int priority, int health, int power, int agility, int defence, int distance, int ammo, int effectiveDistance, coordinateHero pos) {
        super(name, priority, health, power, agility, defence, distance, pos);
        this.ammo = ammo;
        this.effectiveDistance = effectiveDistance;
        this.level = 1;
    }


    protected void shot(heroySet target) {
        ammo--;
        float dist = position.distanceTo(target.position);
        int damage = getRound(power, 10) + (power / 10) * level;
        if (dist > effectiveDistance)
            damage *= 0.5f;
        else if (dist < effectiveDistance)
            damage *= 1.2f;

        boolean critical = (this.agility / 3) >= rnd.nextInt(100);
        if (critical) {
            damage *= 2.0f;
        }
        int res = target.getDamage(damage);
    }


    @Override
    public void step(ArrayList<heroySet> enemies, ArrayList<heroySet> friends) {
        if (health <= 0 || ammo <= 0) {
            return;
        }
        heroySet target = this.findNearestPerson(enemies);
        if (target != null) {
            shot(target);
        }
    }
}
