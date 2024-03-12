package DZ_1;

public class Main {
    public static void main(String[] args) {

        HeroySet hero1 = new Magician("Wolfer", 150, 100);
        System.out.println(hero1.GetInfo());

        HeroySet hero2 = new Monk("Blade", 150, 100);
        System.out.println(hero2.GetInfo());

        HeroySet hero5 = new Sniper("Zobenos", 150, 100);
        System.out.println(hero5.GetInfo());

        HeroySet hero3 = new Peasant("Foedus", 150, 100, 15, 15);
        System.out.println(hero3.GetInfo());


        HeroySet hero6 = new Arbalester("Daspecori", 150, 100);
        System.out.println(hero6.GetInfo());


        HeroySet hero4 = new Outlaw("Indanaur", 150, 100);
        System.out.println(hero4.GetInfo());





        HeroySet hero7 = new Spearmen("Jandasan", 150, 100);
        System.out.println(hero7.GetInfo());

    }

}
