package DZ_1.GemeSetting;

import DZ_1.Heroes.*;

import java.util.ArrayList;
import java.util.Random;

public class createCommandHero {
    public  static ArrayList<heroySet> hollyTeam = new ArrayList<>();
    public  static ArrayList<heroySet> darkTeam = new ArrayList<>();
    //public  static ArrayList<heroySet> allTeam = new ArrayList<>();









    public  static ArrayList<heroySet> teamCreator(int val, int num){
        ArrayList<heroySet> team = new ArrayList<>(0);
        int teamCount = 10;
        for (int i = 0; i <= teamCount; i++) {
            switch (new Random().nextInt(4) + num){


                case 0:
                    team.add(new arbalester(fillName(), 100, 150 , 0 , i));
                    break;
                case 1 :
                    team.add(new magician(fillName(),100, 150, 0, i ));
                    break;
                case 2 :
                    team.add(new outlaw(fillName(), 100, 150, 0, i));
                    break;
                case 3 :
                    team.add(new monk(fillName(),100, 0, num * 3, i));
                    break;
                case 4 :
                    team.add(new peasant(fillName(), 100, 150, 15,15,9, i));
                    break;
                case 5 :
                    team.add(new sniper(fillName(), 100, 150, 9, i));
                    break;
                case 6 :
                    team.add(new spearmen(fillName(),100, 150,9, i));
                    break;
                default:
                    System.out.println("Man code error");
                    break;


            }

        }
        return team;

    }
    private static String fillName(){
        return String.valueOf(names.values()[new Random().nextInt(names.values().length -1)]);
    }
}
