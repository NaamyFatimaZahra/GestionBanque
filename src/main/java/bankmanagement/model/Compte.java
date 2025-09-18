package bankmanagement.model;

import java.util.HashMap;
import java.util.HashSet;

public class Compte{
    private TypeCompte typeCompte;

    private String numeroCompte;
    private float solde;

    HashSet<Transaction> historiqueTransaction = new HashSet<>();

    public Compte(String compteur,float solde, TypeCompte typeDeCompte) {

        this.numeroCompte = compteur;
        this.solde = solde;
        this.typeCompte = typeDeCompte;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public TypeCompte getTypeDeCompte() {
        return typeCompte;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    public HashSet<Transaction> getHistoriqueTransaction() {
        return historiqueTransaction;
    }

    public void setHistoriqueTransaction(HashSet<Transaction> historiqueTransaction) {
        this.historiqueTransaction = historiqueTransaction;
    }
}