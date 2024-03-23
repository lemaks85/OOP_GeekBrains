package DZ_1.GemeSetting;

public class coordinateHero {
    private int curX;
    private int curY;

    private static int width;
    private static int height;

    static {
        width = 10;
        height = 10;
    }

    public coordinateHero(int x, int y)
    {
        curX = x;
        curY = y;
    }

    /*
        Геттеры и сеттеры
     */
    public void setXY(int x, int y)
    {
        curX = x;
        curY = y;
    }

    public int getX() {
        return curX;
    }

    public int getY() {
        return curY;
    }

    public static void setWidth(int width) {
        coordinateHero.width = width;
    }

    public static void setHeight(int height) {
        coordinateHero.height = height;
    }

    public static int getWidth() {
        return width;
    }

    public static int getHeight() {
        return height;
    }


    public void increment(int dx, int dy)
    {
        curX += dx;
        curY += dy;
    }
    /**
     * Проверка на возможность хода на заданную позицию
     *
     * @param x Предполагаемая позиция по оси X
     * @param y Предполагаемая позиция по оси Y
     * @return  true - если ход возможен
     */
    public boolean isMove(int x, int y)
    {
        return x >= 0 && x < width && y >= 0 && y < height;
    }

    /**
     * Вычисляет расстояние расстояние до другой точки
     *
     * @param target До куда считаем
     * @return       Расстояние
     */
    public float distanceTo(coordinateHero target)
    {
        float x = curX - target.getX();
        float y = curY - target.getY();
        return (float) Math.sqrt(x*x + y*y);
    }

    public float fastDistance(coordinateHero target, int dx, int dy)
    {
        float tx = curX+dx - target.getX();
        float ty = curY+dy - target.getY();
        return (tx*tx + ty*ty);
    }

    /**
     * Возвращает разницу координат
     * @param to
     * @return
     */
    public coordinateHero getDelta(coordinateHero to)
    {
        return new coordinateHero(to.curX-curX, to.curY-curY);
    }

    /**
     * Сравнение координат
     * @param to Проверяемые координаты
     * @return true если равны
     */
    public boolean equal(coordinateHero to)
    {
        return curX == to.curX && curY == to.curY;
    }

    public String toString()
    {
        return curX + ":" + curY;
    }
//    public int x, y;
//    public CoordinateHero(int x, int y){
//        this.x = x;
//        this.y = y;
//
//    }
//    public List<Integer> getPosition() {
//        List<Integer> list = new ArrayList<>();
//        list.add(x);
//        list.add(y);
//        return list;
//    }
//    public int getX(){
//        return x;
//    }
//    public int getY(){
//        return y;
//    }
//
//    public double distHero(CoordinateHero target){
//        double targetDist = Math.sqrt(Math.pow(target.x - x, 2)+ (Math.pow(target.y - y, 2)));
//        return targetDist;
//    }
//    public float distanceTo(CoordinateHero target)
//    {
//        float x = getX() - target.getX();
//        float y = getY() - target.getY();
//        return (float) Math.sqrt(x*x + y*y);
//    }
}
