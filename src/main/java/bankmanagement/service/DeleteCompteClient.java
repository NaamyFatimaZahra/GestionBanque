package bankmanagement.service;

import bankmanagement.model.Banque;
import bankmanagement.model.Client;

import java.util.HashSet;
import java.util.Scanner;

public class DeleteCompteClient {
    private Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
          Client client=new DeleteCompteClient().getClients();
        if (client != null) {

            Banque.clients.remove(client);
            System.out.println("✅ Client supprimé avec succès !");
        } else {
            System.out.println("⚠ Aucun client supprimé.");
        }

    }

    public Client getClients() {
        System.out.print("Entrer l'ID du client : ");
        int idClientASupprime = sc.nextInt();
        sc.nextLine();

        HashSet<Client> banqueClients = Banque.clients;

        for (Client c : banqueClients) {
            if (c.getId() == idClientASupprime) {
                System.out.println("Client trouvé : " + c.getComptes().get("Current").getNumeroCompte());
                return c;
            }
        }


        System.out.println("Client introuvable !");
        return null;
    }


 }
