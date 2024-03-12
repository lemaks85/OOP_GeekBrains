package DZ_1;

public abstract class HeroySet {
    protected String Name;
    protected int Hp;
    protected int Armor;


    public HeroySet(String name, int hp, int armor) {
        this.Name = name;
        this.Hp = hp;
        this.Armor = armor;
    }


    public abstract String GetInfo(); // Информация по игроку
}
