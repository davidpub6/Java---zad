package Web1;

public class Punkt {
    private int x;
    private int y;

    public Punkt() {
        this.x=0;
        this.y=0;
    }
    public Punkt(int x, int y) {
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

    public double odleglosc (int x2, int y2){
        int x1 = this.x;
        int y1 = this.y;

        return Math.sqrt( Math.pow((x1-x2),2) + Math.pow((y1-y2),2) );
    }
    public double odleglosc (Punkt p2){
        int x1 = this.x;
        int y1 = this.y;

        int x2 = p2.getX();
        int y2 = p2.getY();

        return Math.sqrt( Math.pow((x1-x2),2) + Math.pow((y1-y2),2) );
    }
}
