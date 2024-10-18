package Zad2;

public class Main {

    public static String builder(int n, String ... word){
        String fin = "";
        for(int i=0; i< word.length; i++){
            if((i+1)%n != 0) {
                fin += word[i];
            }
        }
        return fin;
    }

    public static void main(String[] args) {
        System.out.println(builder(3, "Ala ","nie ","ma ","psa i ","kota ", "test "));
    }
}
