package bankmanagement.service;

import bankmanagement.model.Banque;
import bankmanagement.model.Client;
import bankmanagement.model.Compte;

import java.util.Scanner;

public class AuthClient {
    private Scanner sc = new Scanner(System.in);
    public static Client authentifier(String email, String mdp) {
        for (Client c : Banque.clients) {
            if (c.getEmail().equals(email) && c.getMotDePasse().equals(mdp)) {
                return c;
            }
        }
        return null;
    }
    public void connecterCompte(Client client){
        if (client == null) {
            System.out.println("Identifiants incorrects !");
            return;
        }

        System.out.println(" Bienvenue " + client.getNom());

        if (client.getComptes().size() == 1) {


            for (Compte c : client.getComptes().values()) {
                afficherCompte(c);
                break;
            }


        } else {
            System.out.println("Choisissez un compte : ");
            int i = 1;
            for (String type : client.getComptes().keySet()) {
                System.out.println(i + " - " + type);
                i++;
            }
            int choix = sc.nextInt();
            String typeChoisi = (String) client.getComptes().keySet().toArray()[choix - 1];
            afficherCompte(client.getComptes().get(typeChoisi));
        }
    }
    private void afficherCompte(Compte compte) {
        System.out.println("\n=== Compte ===");
        System.out.println("Numéro : " + compte.getNumeroCompte());
        System.out.println("Solde : " + compte.getSolde());

    }
}
