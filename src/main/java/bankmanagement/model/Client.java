package bankmanagement.model;

import java.util.HashMap;

public class Client extends Personne{
    private int id;

    HashMap<String,Compte> compte = new HashMap<String, Compte>();

    //getter Id
    public int getId() {
        return id;
    }

    //getter Compte
    public HashMap<String, Compte> getCompte(HashMap<String, Compte> compte) {
        return compte;
    }
    //setter Compte
    public void setCompte(HashMap<String, Compte> compte) {
        this.compte = compte;
    }
}