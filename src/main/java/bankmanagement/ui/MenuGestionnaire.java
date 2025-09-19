package bankmanagement.ui;

import java.util.Scanner;

public class MenuGestionnaire {

    private Scanner sc = new Scanner(System.in);


    public void afficherMenu() {
        System.out.println("=== Bienvenue au compte Gestionnaire ===");
        System.out.println("Veuillez choisir une option :");
        System.out.println("1 - Créer un compte");
        System.out.println("2 - Clôturer un compte");
        System.out.println("3 - Modifier un compte");
        System.out.println("4 - Consulter le relevé bancaire d'un compte");
        System.out.println("5 - Créditer un montant sur un compte");
        System.out.println("6 - Ajouter un compte épargne");
        System.out.print("Votre choix : ");

        int choix = sc.nextInt();
        traiterChoix(choix); // on envoie le choix à une autre méthode
    }


    public void traiterChoix(int choix) {
        switch (choix) {
            case 1 -> System.out.println(">> Création d’un compte en cours...");
            case 2 -> System.out.println(">> Clôture d’un compte en cours...");
            case 3 -> System.out.println(">> Modification d’un compte en cours...");
            case 4 -> System.out.println(">> Consultation du relevé bancaire...");
            case 5 -> System.out.println(">> Crédit d’un montant en cours...");
            case 6 -> System.out.println(">> Ajout d’un compte épargne en cours...");
            default -> System.out.println("Choix invalide, veuillez réessayer.");
        }
    }


    public static void main(String[] args) {
        MenuGestionnaire menu = new MenuGestionnaire();
        menu.afficherMenu();
        menu.sc.close();
    }
}
