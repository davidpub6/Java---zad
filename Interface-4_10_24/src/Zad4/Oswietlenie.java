package Zad4;

public class Oswietlenie extends InteligenteUrzadzenie{

    @Override
    void ustawHarmonogram() {
        System.out.println("Ustawiono harmonogram dla oświetlenia");
    }

    @Override
    public void wlacz() {
        System.out.println("Oświetlenie włączone");
    }

    @Override
    public void wylacz() {
        System.out.println("Oświetlenie wyłączone");
    }
}
