package bankmanagement.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CreationDeCompteClient {


    private Map<String, String> users = new HashMap<>();
    private Scanner sc=new Scanner(System.in);
    public static int numCompte = 0;

    public static void main(String[] args) {

    }

    public void signUp(){
        System.out.println("=== Inscription ===");

        System.out.print("Entrez votre nom d'utilisateur : ");
        String username = sc.nextLine();

        if (users.containsKey(username)) {
            System.out.println("Erreur : ce nom d'utilisateur existe déjà !");
            return;
        }

        System.out.print("Entrez votre mot de passe : ");
        String password = sc.nextLine();


        System.out.println("Inscription réussie pour l'utilisateur : " + username);
    }

    public void CreateCompte(){

    }
}
