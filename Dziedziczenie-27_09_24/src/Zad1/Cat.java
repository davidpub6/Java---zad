package Zad1;

public class Cat extends Animal{

    public Cat() {
    }

    public Cat(String name, String color) {
        super(name, color);
    }

    public String makeSound () {
        return "Meow , "+this.getName()+" , "+this.getColor();
    }
}
