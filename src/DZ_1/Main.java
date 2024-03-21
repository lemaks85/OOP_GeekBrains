package DZ_1;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
hollyTeam = teamCreator(0,0);
darkTeam = teamCreator(0,3);
        System.out.println(hollyTeam);
        System.out.println(darkTeam);
    }
public  static ArrayList<HeroySet> hollyTeam;
public  static ArrayList<HeroySet> darkTeam;
public  static ArrayList<HeroySet> teamCreator(int val,  int num){
    ArrayList<HeroySet> team = new ArrayList<>(0);
    int teamCount = 10;
    for (int i = 0; i <= teamCount; i++) {
        switch (new Random().nextInt(4) + num){
            case 0:
                team.add(new Arbalester(fillName(), 100, 150 , 0 , i));
                    break;
            case 1 :
                team.add(new Magician(fillName(),100, 150, 0, i ));
                break;
            case 2 :
                team.add(new Outlaw(fillName(), 100, 150, 0, i));
                break;
            case 3 :
                team.add(new Monk(fillName(),100, 0, num * 3, i));
                break;
            case 4 :
                team.add(new Peasant(fillName(), 100, 150, 15,15,9, i));
                break;
            case 5 :
                team.add(new Sniper(fillName(), 100, 150, 9, i));
                break;
            case 6 :
                team.add(new Spearmen(fillName(),100, 150,9, i));
                break;
            default:
                System.out.println("Man code error");



        }
        
    }
return team;
}
private static String fillName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length -1)]);
}

}
