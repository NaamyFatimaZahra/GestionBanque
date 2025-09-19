package bankmanagement.service;

import bankmanagement.classesUtilitaire.NumeroDeCompteGenerator;
import bankmanagement.classesUtilitaire.PasswordGenerator;
import bankmanagement.model.Banque;
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

    private Compte  newCompte;
    private Client newClient;

    public static void main(String[] args) {
        CreationDeCompteClient compteClient = new CreationDeCompteClient();

        int Choix=compteClient.afficherChoiceCompte();
       switch (Choix) {
           case 1: {
               compteClient.CreateCompteCourant();
               Client client = compteClient.CreateClient();
               new Banque().stockerClient(client);
                break;
           }
               case 2: {
                   compteClient.CreateCompteEpargne();
                   System.out.println("compte epargne cree avec succee.");
                   break;
               }
       }
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


    public Compte CreateCompteCourant(){
        String numCompte= NumeroDeCompteGenerator.generateNumeroDeCompte(14);
        this.newCompte = new Compte(numCompte,0, TypeCompte.courant);
        return this.newCompte;
    }


    public void CreateCompteEpargne(){
          Client clientById= this.afficherEnterIdClient();
        if (clientById == null) {
            System.out.println("Client introuvable !");
            return ;
        }
        String numCompte= NumeroDeCompteGenerator.generateNumeroDeCompte(14);
        this.newCompte = new Compte(numCompte,0, TypeCompte.eparnge);
        clientById.getComptes().put("epargne",this.newCompte);
        clientById.getComptes().forEach((type, compte) -> {
            System.out.println(type + " -> Numéro : " + compte.getNumeroCompte());
        });

    }

    public Client afficherEnterIdClient() {
        System.out.print("Entrer l'ID du client : ");
        int idClientASupprime = sc.nextInt();
        sc.nextLine();
        return Client.getClientByID(idClientASupprime);
    }

    public int afficherChoiceCompte(){
        System.out.println("choisi votre compte :");
        System.out.println("1-Courant");
        System.out.println("2-epargne");
         int choix= sc.nextInt();
       sc.nextLine();
         return choix;

    }

}
