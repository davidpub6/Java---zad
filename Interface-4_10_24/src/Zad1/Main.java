package Zad1;

public class Main {
    public static void main(String[] args) {
        Pies pies = new Pies();
        Kot kot = new Kot();

        pies.wydajDzwiek();
        pies.poruszajSie();
        System.out.println("\n\n");
        kot.wydajDzwiek();
        kot.poruszajSie();
    }
}
