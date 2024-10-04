package Zad4;

public class Termostat extends InteligenteUrzadzenie{

    @Override
    void ustawHarmonogram() {
        System.out.println("Ustawiono harmonogram dla termostatu");
    }

    @Override
    public void wlacz() {
        System.out.println("Termostat włączony");
    }

    @Override
    public void wylacz() {
        System.out.println("Termostat wyłączony");
    }
}
