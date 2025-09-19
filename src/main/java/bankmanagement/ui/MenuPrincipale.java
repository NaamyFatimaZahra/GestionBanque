package bankmanagement.ui;

import java.util.Scanner;

public class MenuPrincipale {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String choix;

        while (true) {
            System.out.println("\n=== Bienvenue à FinBank ===");
            System.out.println("Choisissez votre rôle :");
            System.out.println("1 - Gestionnaire");
            System.out.println("2 - Client");
            System.out.println("3 - Quitter");
            System.out.print("Votre choix : ");

            choix = scan.nextLine();

            if ("3".equals(choix)) {
                System.out.println("Merci d'avoir utilisé FinBank. À bientôt !");
                break; // on sort du while
            }

            switchRole(choix);
        }

        scan.close();
    }

    public static void switchRole(String choix) {
        switch (choix) {
            case "1" -> MenuGestionnaire.main(new String[]{});
            case "2" -> MenuClient.main(new String[]{});
            default -> System.out.println("Choix invalide, veuillez réessayer.");
        }
    }
}
