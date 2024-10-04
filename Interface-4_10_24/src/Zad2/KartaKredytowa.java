package Zad2;

public class KartaKredytowa extends KartaPlatnicza{

    private double limit;

    public KartaKredytowa() {
        this.limit=0;
        this.saldo=0;
    }

    public KartaKredytowa(double saldo) {
        super(saldo);
        this.limit=0;
    }

    public KartaKredytowa(double saldo, double limit) {
        super(saldo);
        this.limit = limit;
    }

    @Override
    public void wykonajPlatnosc(double kwota) {
        if(kwota<=this.saldo+this.limit) {
            this.saldo -= kwota;
            System.out.println("Platnosc "+kwota+"zł zaakceptowana");
        }
        else{
            System.out.println("Platnosc "+kwota+"zł odrzucona");
        }
    }

    @Override
    public void doladuj(double kwota) {
        this.saldo += kwota;
        System.out.println("Doładowano "+kwota+"zł. Nowe saldo :"+this.saldo);

    }
}
