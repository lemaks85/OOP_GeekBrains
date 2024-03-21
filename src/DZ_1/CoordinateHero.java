package DZ_1;

import java.util.ArrayList;
import java.util.List;

public class CoordinateHero {
    protected int x, y;
    public CoordinateHero(int x, int y){
        this.x = x;
        this.y = y;

    }
    public List<Integer> getPosition() {
        List<Integer> list = new ArrayList<>();
        list.add(x);
        list.add(y);
        return list;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public double distHero(CoordinateHero target){
        double targetDist = Math.sqrt(Math.pow(target.x - x, 2)+ (Math.pow(target.y - y, 2)));
        return targetDist;
    }
    public float distanceTo(CoordinateHero target)
    {
        float x = getX() - target.getX();
        float y = getY() - target.getY();
        return (float) Math.sqrt(x*x + y*y);
    }
}
