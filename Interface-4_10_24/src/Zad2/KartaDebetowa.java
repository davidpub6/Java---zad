package Zad2;

public class KartaDebetowa extends KartaPlatnicza{


    public KartaDebetowa() {
        this.saldo=0;
    }

    public KartaDebetowa(double saldo) {
        super(saldo);
    }

    @Override
    public void wykonajPlatnosc(double kwota) {
        if(kwota<=this.saldo) {
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
