package Web1;

public class Wiatrak {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;

    private int speed;
    private boolean on;

    private int radius;

    private String colour;

    public Wiatrak() {
        this.speed = 1;
        this.on = false;
        this.radius = 1;
        this.colour = "White";
    }
    public Wiatrak(int speed, boolean on, int radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.colour = color;
    }

    public String informacje () {
        return "Speed:"+this.speed+" , On:"+this.on+" , Radius:"+this.radius+" , Colour:"+this.colour;
    }
}
