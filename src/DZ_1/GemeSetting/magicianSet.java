package DZ_1.GemeSetting;

import java.util.ArrayList;
import java.util.stream.Collectors;

public abstract class magicianSet extends heroySet {
    protected int mana;                   
    protected int maxMana;

    
    protected magicianSet(String name, int priority, int health, int power, int agility, int defence, int distance, int mana, coordinateHero pos) {
        super(name, priority, health, power, agility, defence, distance, pos);
        this.mana = mana;
        this.maxMana = mana;
    }

    @Override
    public void step(ArrayList<heroySet> enemies, ArrayList<heroySet> friends) {
        heroySet pt = null;
        int min = Integer.MAX_VALUE;
        if (health <= 0)
            return;
        if (mana <= 0) {
            mana += 5;
            return;
        }
        if (getDieds(friends) > 3 ){
            doRes(friends);

        }
        else doHealth(friends);

    }
    private void doRes(ArrayList<heroySet> friends){
        if (mana < 50)
            return;
        heroySet pt = friends.stream()
                .filter(n-> n.health == 0)
                .sorted((n1, n2) -> n2.priority - n1.priority)
                .collect(Collectors.toList())
                .getFirst();
                
        pt.healed(Integer.MAX_VALUE);
        mana -= 50;
    }


    private void doHealth(ArrayList<heroySet> friends) {
        heroySet pt = null;
        int min = Integer.MAX_VALUE;
        for (heroySet friend : friends) {
            int hp = friend.getHealth();
            if (hp > 0 && hp < friend.maxHealth) {
                hp = hp * 100 / maxHealth;
                if (hp < min) {
                    min = hp;
                    pt = friend;
                }
            }
        }
        if (pt != null) {
            int ig71 = 10;
            mana -= 10;
            if (mana < 0) {
                ig71 += mana;
                mana = 0;
            }
            pt.healed(ig71 * 3);
        }
    }

    int getDieds(ArrayList<heroySet> paris) {
        return (int) paris.stream().filter(n -> n.health == 0).count();
    }

}