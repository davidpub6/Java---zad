package Web1;

public class Kwadrat {

    private int bok;

    public Kwadrat(int bok) {
        this.bok = bok;
    }
    public Kwadrat() {
    }

    public int getBok() {
        return bok;
    }
    public void setBok(int bok) {
        this.bok = bok;
    }

    public int Pole (){
        int bok = this.bok;
        return bok*bok;
    }

    public int Obwod () {
        int bok = this.bok;
        return bok*4;
    }
}
