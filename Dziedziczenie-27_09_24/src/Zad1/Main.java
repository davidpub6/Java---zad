package Zad1;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Cat kot = new Cat("Mruczek", "Biały");
        Dog pies = new Dog("Max", "Rudy");
        System.out.println(kot.makeSound());
        System.out.println(pies.makeSound());
    }
}