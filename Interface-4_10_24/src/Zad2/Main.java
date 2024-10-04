package Zad2;

public class Main {
    public static void main(String[] args) {
        KartaDebetowa debit = new KartaDebetowa(1000);
        debit.wykonajPlatnosc(1100);
        debit.doladuj(200);
        debit.wykonajPlatnosc(1100);
        debit.doladuj(0);

        System.out.println("\n");
        KartaKredytowa credit = new KartaKredytowa(1000, 100);
        credit.wykonajPlatnosc(1200);
        credit.wykonajPlatnosc(1100);
        credit.doladuj(0);
    }
}
