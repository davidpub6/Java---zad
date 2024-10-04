package Zad3;

public class Main {
    public static void main(String[] args) {
        OperacjeNaTekscie op1 = new UsunSpacje();
        System.out.println(op1.wykonaj("Po Co Komu Spacje"));
        System.out.println(op1.cofnij());
    }
}
