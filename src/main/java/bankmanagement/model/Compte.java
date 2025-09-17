package bankmanagement.model;

import java.util.HashMap;

class Compte{
    enum typeCompte{
        courant,
        eparnge
    }
    private Integer numeroCompte;
    private Float Solde;
    typeCompte typeDeCompte;
    HashMap<Integer, String> historiqueTransaction = new HashMap<Integer, String>();

}