package Zad2;


class A {
    public void present(String phrase){
        System.out.println(phrase);
    }
}

class B extends A {
    public void present(String phrase){
        super.present(phrase);
    }
}

class C extends B{
    public void present(String phrase){
        super.present(phrase);
    }
}

class D extends C{
    public void present(String phrase){
        super.present(phrase);
    }
}

class E extends D{
    public void present(String phrase){
        super.present(phrase);
    }
}



public class Main {
    public static void main(String[] args) {

        E e = new E();
        e.present("e");

    }
}
