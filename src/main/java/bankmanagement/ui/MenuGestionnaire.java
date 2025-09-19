package bankmanagement.ui;

import bankmanagement.service.CreationDeCompteClient;
import bankmanagement.service.DeleteCompteClient;
import bankmanagement.service.ModifierCompte;

import java.util.Scanner;

public class MenuGestionnaire {

    private Scanner sc = new Scanner(System.in);

    public void afficherMenu() {
        boolean quitter = false;

        while (!quitter) {
            System.out.println("\n=== Bienvenue au compte Gestionnaire ===");
            System.out.println("Veuillez choisir une option :");
            System.out.println("1 - Créer un compte");
            System.out.println("2 - Clôturer un compte");
            System.out.println("3 - Modifier un compte");
            System.out.println("4 - Consulter le relevé bancaire d'un compte");
            System.out.println("5 - Créditer un montant sur un compte");
            System.out.println("6 - Ajouter un compte épargne");
            System.out.println("7 - Quitter");
            System.out.print("Votre choix : ");

            int choix = sc.nextInt();
            sc.nextLine();

            switch (choix) {
                case 1 -> CreationDeCompteClient.main(new String[]{});
                case 2 -> DeleteCompteClient.main(new String[]{});
                case 3 -> ModifierCompte.main(new String[]{});
                case 4 -> System.out.println(">> Consultation du relevé bancaire...");
                case 5 -> System.out.println(">> Crédit d’un montant en cours...");
                case 6 -> System.out.println(">> Ajout d’un compte épargne en cours...");
                case 7 -> {
                    System.out.println("Au revoir !");
                   return;
                }
                default -> System.out.println("Choix invalide, veuillez réessayer.");
            }
        }

        sc.close();
    }

    public static void main(String[] args) {
        MenuGestionnaire menu = new MenuGestionnaire();
        menu.afficherMenu();
    }
}
