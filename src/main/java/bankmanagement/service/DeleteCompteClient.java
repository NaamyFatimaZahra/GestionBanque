package bankmanagement.service;

import bankmanagement.model.Banque;
import bankmanagement.model.Client;
import bankmanagement.model.Compte;

import java.util.Scanner;

public class DeleteCompteClient {
    private Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        DeleteCompteClient service = new DeleteCompteClient();
        Client client = service.afficherEnterIdClient();

        if (client != null) {
            service.supprimerCompte(client);
        } else {
            System.out.println("⚠ Aucun client trouvé.");
        }
    }

    public Client afficherEnterIdClient() {
        System.out.print("Entrer l'ID du client : ");
        int idClientASupprime = sc.nextInt();
        sc.nextLine();
        return Client.getClientByID(idClientASupprime);
    }

    public void supprimerCompte(Client client) {
        System.out.println("\n=== Comptes du client ===");
       if (!client.getComptes().isEmpty()) {
           client.getComptes().forEach((type, compte) -> {
               System.out.println(type + " -> Numéro : " + compte.getNumeroCompte());
           });
       }else {
           System.out.println("La liste des comptes est vide !");
           return;
       }

        System.out.print("\nQuel compte voulez-vous supprimer ? (courant / epargne) : ");
        String choix = sc.nextLine();

        if (client.getComptes().containsKey(choix)) {
            client.getComptes().remove(choix);
            System.out.println(" Compte " + choix + " supprimé avec succès !");
        } else {
            System.out.println("⚠ Ce client n’a pas de compte " + choix + ".");
        }
    }
}
