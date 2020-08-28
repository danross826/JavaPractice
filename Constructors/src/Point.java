public class Point {
    private int x;
    private int y;

    public Point() {

    }

    public Point(int x, int y) {

        if (x < 0){

            x = 0;
        }

        if (y < 0){

            y = 0;
        }

        this.x = x;
        this.y = y;

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){

        double d = Math.sqrt((0 - x) * (0 - x) + (0 - y) * (0 - y));

        return d;

    }

    public double distance(int xB, int yB){

        double d = Math.sqrt((xB - x) * (xB - x) + (yB - y) * (yB - y));

        return d;

    }




}
