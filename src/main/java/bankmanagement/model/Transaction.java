package bankmanagement.model;

import java.util.Date;

class Transaction{
    enum typeTransaction{
        depot,
        retraits,
        virement
    }

    private Integer idTransaction;
    typeTransaction typeTransaction;
    private Float montant;
    private Date date;
    private Integer idCompteSource;
    private Integer idCompteDestination;
}