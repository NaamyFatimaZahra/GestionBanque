package bankmanagement.service;

import bankmanagement.model.Banque;
import bankmanagement.model.Client;

import java.util.Scanner;

public class ModifierCompte {
    private Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        ModifierCompte modif = new ModifierCompte();
        Client client = modif.afficher();

        if (client != null) {
            modif.modifierClient(client);
        } else {
            System.out.println("Client introuvable !");
        }
    }

    // Récupération d'un client par son ID
    public Client afficher() {
        System.out.print("Entrer l'ID du client : ");
        int idClientASupprime = sc.nextInt();
        sc.nextLine();

        return Client.getClientByID(idClientASupprime);
    }


    public void modifierClient(Client client) {
        System.out.println("\n=== Modification du client ID " + client.getId() + " ===");
        System.out.println("1 - Modifier le nom");
        System.out.println("2 - Modifier le prénom");
        System.out.println("3 - Modifier l’email");
        System.out.print("Votre choix : ");
        int choix = sc.nextInt();
        sc.nextLine();

        switch (choix) {
            case 1 -> {
                System.out.print("Nouveau nom : ");
                String nouveauNom = sc.nextLine();
                client.setNom(nouveauNom);
            }
            case 2 -> {
                System.out.print("Nouveau prénom : ");
                String nouveauPrenom = sc.nextLine();
                client.setPrenom(nouveauPrenom);
            }
            case 3 -> {
                System.out.print("Nouvel email : ");
                String nouvelEmail = sc.nextLine();
                client.setEmail(nouvelEmail);
            }
            default -> System.out.println("Choix invalide !");
        }

        System.out.println("✅ Modifications enregistrées avec succès !");
    }
}
