package bankmanagement.model;

import java.util.Date;

class Transaction{

    private int idTransaction;
    TypeTransaction typeTransaction;
    private float montant;
    private Date date;
    private int idCompteSource;
    private int idCompteDestination;

    public Transaction(int idTransaction, TypeTransaction typeTransaction, float montant, Date date, int idCompteSource, int idCompteDestination) {
        this.idTransaction=idTransaction;
        this.typeTransaction=typeTransaction;
        this.montant=montant;
        this.date=date;
        this.idCompteSource=idCompteSource;
        this.idCompteDestination=idCompteDestination;
    }

    //getters & setters date
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    //getters & setters idTransaction
    public Integer getIdTransaction() {
        return idTransaction;
    }
    public void setIdTransaction(Integer idTransaction) {
        this.idTransaction = idTransaction;

    }
    //getters & setters montant
    public Float getMontant() {
        return montant;
    }
    public void setMontant(Float montant) {
        this.montant = montant;
    }

    //getters & setters idCompteSource
    public Integer getIdCompteSource() {
        return idCompteSource;
    }
    public void setIdCompteSource(Integer idCompteSource) {
        this.idCompteSource = idCompteSource;
    }

    //getters & setters idCompteDestination
    public Integer getIdCompteDestination() {
        return idCompteDestination;
    }
    public void setIdCompteDestination(Integer idCompteDestination) {
        this.idCompteDestination = idCompteDestination;
    }

    //getters & setters typeTransaction
    public TypeTransaction getTypeTransaction() {
        return typeTransaction;
    }
    public void setTypeTransaction(TypeTransaction typeTransaction) {
        this.typeTransaction = typeTransaction;
    }

}