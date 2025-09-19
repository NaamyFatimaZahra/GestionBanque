package bankmanagement.model;

import java.util.HashMap;
import java.util.HashSet;

public class Compte{
    private TypeCompte typeCompte;
    private static int compteur = 0;
    private int numeroCompte;
    private float solde;

    HashSet<Transaction> historiqueTransaction = new HashSet<>();

    public Compte(float solde, TypeCompte typeDeCompte) {
        compteur++;
        this.numeroCompte = compteur;
        this.solde = solde;
        this.typeCompte = typeDeCompte;
    }

    public int getNumeroCompte() {
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