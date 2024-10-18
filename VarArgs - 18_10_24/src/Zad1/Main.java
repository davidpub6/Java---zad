package Zad1;

public class Main {

    public static void Info(Person ... people){
        for (Person person : people) {
            System.out.println(person.toString());
        }
    }

    public static void main(String[] args) {
        Person Karol = new Person("Karol", "Kowalski", "KarolK@email.test", "Targ Sienny 7, 80-807 Gdansk");
        Person Damian = new Person("Damian", "Damianczyk", "DamianD@email.test", "Targ Sienny 7, 80-807 Gdansk");

        Info(Karol, Damian);
    }


}
