package DZ_1.StartGeme;
import DZ_1.GemeSetting.heroySet;
import DZ_1.GemeSetting.priorityHero;

import java.util.ArrayList;

import static DZ_1.GemeSetting.createCommandHero.*;
import static java.util.Collections.addAll;


public class main  {
    public static void main(String[] args) {

hollyTeam = teamCreator(0,0);
darkTeam = teamCreator(0,3);
ArrayList<heroySet> allTeam = new ArrayList<>(hollyTeam);
ArrayList<heroySet> allTeam1 = new ArrayList<>(allTeam);


//all.sort(new priorityHero());
allTeam.sort((o1, o2) -> Integer.compare(o2.priority, o1.priority));
    System.out.println(hollyTeam);
    System.out.println(darkTeam);
    }
}
