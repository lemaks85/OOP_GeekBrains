package DZ_1.GemeSetting;

import java.util.ArrayList;

public abstract class magicianSet extends heroySet{
    protected int mana;
    protected int maxMana;


    protected magicianSet(String name, int priority, int health, int power, int agility, int defence, int distance, int mana, coordinateHero pos) {
        super(name, priority, health, power, agility, defence, distance, pos);
        this.mana = mana;
        this.maxMana = mana;
    }

    @Override
    public void step(ArrayList<heroySet> enemies, ArrayList<heroySet> friends) {

    }
}
