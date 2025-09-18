package bankmanagement.model;

import java.util.HashMap;

public class Compte{

    private TypeCompte typeCompte;
    private int numeroCompte;
    private float Solde;
    TypeCompte typeDeCompte;
    HashMap<Integer, String> historiqueTransaction = new HashMap<Integer, String>();

    public Compte(TypeCompte typeCompte, int numeroCompte, float Solde, TypeCompte typeDeCompte){
        this.typeCompte=typeCompte;
        this.numeroCompte=numeroCompte;
        this.Solde=Solde;
        this.typeDeCompte=typeDeCompte;
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
    public HashMap<Integer, String> getHistoriqueTransaction() {
        return historiqueTransaction;
    }
    public void setHistoriqueTransaction(HashMap<Integer, String> historiqueTransaction) {
        this.historiqueTransaction = historiqueTransaction;
    }

    public TypeCompte getTypeDeCompte() {

        return typeDeCompte;
    }

}