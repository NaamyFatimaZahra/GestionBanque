package bankmanagement.model;

import java.util.HashMap;
import java.util.HashSet;

public class Compte{

    private TypeCompte typeCompte;
    private int numeroCompte;
    private float Solde;

    HashSet<Transaction> historiqueTransaction = new HashSet<Transaction>();

    public Compte(TypeCompte typeCompte, int numeroCompte, float Solde, TypeCompte typeDeCompte){
        this.typeCompte=typeCompte;
        this.numeroCompte=numeroCompte;
        this.Solde=Solde;
        this.typeCompte=typeDeCompte;
    }

    public float getSolde() {
        return Solde;
    }

    public void setSolde(float solde) {
        Solde = solde;
    }
    public int getNumeroCompte() {
        return numeroCompte;
    }
    public void setNumeroCompte(int numeroCompte) {
        this.numeroCompte = numeroCompte;
    }
    public HashSet<Transaction> getHistoriqueTransaction() {
        return historiqueTransaction;
    }
    public void setHistoriqueTransaction(HashSet<Transaction> historiqueTransaction) {
        this.historiqueTransaction = historiqueTransaction;
    }
    public TypeCompte getTypeDeCompte() {
        return typeCompte;
    }



}