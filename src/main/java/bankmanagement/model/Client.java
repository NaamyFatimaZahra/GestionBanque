package bankmanagement.model;

import java.util.HashMap;

public class Client extends Personne{
    private int id;
    HashMap<String,Compte> compte = new HashMap<String, Compte>();

    public Client(char nom, char prenom, char email, int id, HashMap<String,Compte> compte){
        super(nom, prenom, email);
        this.id=id;
        this.compte=compte;
    }


    //getter Id
    public int getId() {
        return id;
    }

    //getter Compte
    public HashMap<String, Compte> getCompte() {
        return compte;
    }
    //setter Compte
    public void setCompte(HashMap<String, Compte> compte) {
        this.compte = compte;
    }
}