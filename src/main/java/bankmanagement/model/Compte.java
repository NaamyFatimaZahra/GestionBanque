package bankmanagement.model;

import java.util.HashMap;

public class Compte{
    enum typeCompte{
        courant,
        eparnge
    }
    private int numeroCompte;
    private float Solde;
    typeCompte typeDeCompte;
    HashMap<Integer, String> historiqueTransaction = new HashMap<Integer, String>();

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
    public HashMap<Integer, String> getHistoriqueTransaction() {
        return historiqueTransaction;
    }
    public void setHistoriqueTransaction(HashMap<Integer, String> historiqueTransaction) {
        this.historiqueTransaction = historiqueTransaction;
    }

    public typeCompte getTypeDeCompte() {
        return typeDeCompte;
    }

}