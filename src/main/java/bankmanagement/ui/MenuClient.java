package bankmanagement.ui;

import bankmanagement.model.Banque;
import bankmanagement.model.Client;
import bankmanagement.model.Compte;
import bankmanagement.service.AuthClient;

import java.util.Scanner;

public class MenuClient {
    private Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new MenuClient().start();
    }

    public void start() {
        System.out.print("Email : ");
        String email = sc.nextLine();

        System.out.print("Mot de passe : ");
        String mdp = sc.nextLine();

        Client client = AuthClient.authentifier(email, mdp);
        new AuthClient().connecterCompte(client);
    }




}
