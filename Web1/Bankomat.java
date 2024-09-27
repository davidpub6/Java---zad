package Web1;

import java.util.Scanner;
public class Bankomat {

    private Konto konto;

    void menu() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter id: ");
        int id = scan.nextInt();
        do{
            System.out.println("Main menu \n 1: Check balance \n 2: withdraw \n 3: deposit \n 4: EXIT");
            System.out.println("Choose an option: ");
            int option = scan.nextInt();

            switch (option){
                case 1: ;
                case 2: ;
                case 3: ;
                case 4: break;
            }
        } while(true);

    }


}
