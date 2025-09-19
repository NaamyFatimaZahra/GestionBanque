package bankmanagement.ui;

import java.util.Scanner;

public class MenuPrincipale {

    public static void main(String[] args){
        System.out.println("Bienvenue a FinBank, est ce que vous pouvez choisi votre role:");
        System.out.println("1- Gestionnaire:");
        System.out.println("2- Client:");
        Scanner scan = new Scanner(System.in);
        String choix=scan.nextLine();
         switchRole(choix);
    }
    public static void switchRole(String choix) {
        if ("1".equals(choix)) {
            MenuGestionnaire.main(new String[]{});
        } else if ("2".equals(choix)) {
            System.out.println("Vous êtes Client.");
        } else {
            System.out.println("Choix invalide.");
        }
    }
}
