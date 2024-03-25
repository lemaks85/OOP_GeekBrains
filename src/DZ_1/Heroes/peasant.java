package DZ_1.Heroes;

import DZ_1.GemeSetting.coordinateHero;
import DZ_1.GemeSetting.heroySet;

import java.util.ArrayList;

public class peasant extends heroySet {
    private static final int HEALTH = 500;
    private static final int POWER = 30;
    private static final int AGILITY = 30;
    private static final int DEFENCE = 0;
    private static final int DISTANCE = 1;
    private static final int FULL_BAG = 24;

    private final int bag;


    public peasant(String name, coordinateHero pos) {
        super(name, 0, HEALTH, POWER, AGILITY, DEFENCE, DISTANCE, pos);
        bag = FULL_BAG;
    }


    @Override
    public void step(ArrayList<heroySet> enemies, ArrayList<heroySet> friends) {

    }

    @Override
    public String getInfo() {
        return "Peasant";
    }

    @Override
    public String toString() {
        return String.format("[Peasant] %s, ❤️=%d, \uD83C\uDFF9=%d, %s", name, health, bag, position.toString());
    }
}




