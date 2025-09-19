package bankmanagement.service;

import bankmanagement.classesUtilitaire.PasswordGenerator;
import bankmanagement.model.Client;
import bankmanagement.model.Compte;
import bankmanagement.model.TypeCompte;
import bankmanagement.ui.MenuGestionnaire;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CreationDeCompteClient {


    private Map<String, String> users = new HashMap<>();
    private Scanner sc=new Scanner(System.in);
    private static int numCompte = 0;
    private Compte  newCompte;
    private Client newClient;

    public static void main(String[] args) {
        CreationDeCompteClient compteClient = new CreationDeCompteClient();


            compteClient.CreateCompte();
        Client client =compteClient.CreateClient();

        // Affichage des informations
        System.out.println("\n=== Infos du client ===");
        System.out.println("ID client : " + client.getId());
        System.out.println("Nom : " + client.getNom());
        System.out.println("Prénom : " + client.getPrenom());
        System.out.println("Email : " + client.getEmail());
        System.out.println("Mot de passe généré : " + client.getMotDePasse());

        System.out.println("\nComptes associés :");
        client.getComptes().forEach((num, compte) -> {
            System.out.println("Numéro du compte : " + compte.getNumeroCompte() + ", Type : " + compte.getTypeDeCompte());
        });
        MenuGestionnaire.main(new String[]{});
    }



    public Compte CreateCompte(){
         this.newCompte = new Compte(0, TypeCompte.courant);
return this.newCompte;

    }
    public Client CreateClient(){

        System.out.println("=== Inscription ===");
        System.out.print("Entrez le nom d'utilisateur : ");
        String nom = sc.nextLine();
        System.out.print("Entrez le prenom d'utilisateur : ");
        String prenom = sc.nextLine();
        System.out.print("Entrez l'email d'utilisateur : ");
        String email = sc.nextLine();
        String motDePasse = PasswordGenerator.generatePassword(10);
        this.newClient=new Client(nom,prenom,email,motDePasse,this.newCompte);
        return this.newClient;


    }


}
