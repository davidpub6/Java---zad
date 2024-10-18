package Zad1;

public class Person {
    private String firstname;
    private String lastname;
    private String email;
    private String adres;

    public Person() {
    }

    public Person(String firstname, String lastname, String email, String adres) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.adres = adres;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    @Override
    public String toString(){

        return STR."Hi, my name is \{this.firstname} \{this.lastname}, my email is \{this.email} and I live at \{this.adres}.";

    }
}
