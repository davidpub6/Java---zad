package Zad1;

public class Dog extends Animal{

    public Dog() {
    }

    public Dog(String name, String color) {
        super(name, color);
    }

    public String makeSound () {
        return "Woof , "+super.getName()+" , "+this.getColor();
    }
}
