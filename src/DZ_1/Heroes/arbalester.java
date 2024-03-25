package DZ_1.Heroes;

import DZ_1.GemeSetting.coordinateHero;
import DZ_1.GemeSetting.shooterSet;

public class arbalester extends shooterSet {
    private static final int HEALTH = 800;
    private static final int POWER = 35;
    private static final int AGILITY = 20;
    private static final int DEFENCE = 5;
    private static final int DISTANCE = 16;
    private static final int ARROWS = 12;
    private static final int EFFECTIVE_DISTANCE = 3;

    public arbalester(String name, coordinateHero pos) {
        super(name, 3, HEALTH, POWER, AGILITY, DEFENCE, DISTANCE, ARROWS, EFFECTIVE_DISTANCE, pos);
    }

    @Override
    public String toString() {
        return String.format("[Arbalester] %s, %d, %d, %s", name, health, ammo, position.toString());
    }

    @Override
    public String getInfo() {
        return "Arbalester " + history;
    }
}
