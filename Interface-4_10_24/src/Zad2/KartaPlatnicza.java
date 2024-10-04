package Zad2;

public abstract class KartaPlatnicza implements Platnosc {
    protected double saldo;

    public KartaPlatnicza() {
    }
    public KartaPlatnicza(double saldo) {
        this.saldo = saldo;
    }

    abstract void doladuj(double kwota);

}
