package bankmanagement.model;

import java.util.HashMap;

public class Client extends Personne {
    private static int compteur = 0;
    private int id;
    private HashMap<Integer, Compte> comptes;

    public Client(String nom, String prenom, String email, String motDePasse, Compte compte) {
        super(nom, prenom, email, motDePasse);

        compteur++;
        this.id = compteur;

        this.comptes = new HashMap<>();
        this.comptes.put(compte.getNumeroCompte(), compte); // clé = numéro du compte
    }

    // Getter Id
    public int getId() {
        return id;
    }

    // Getter comptes
    public HashMap<Integer, Compte> getComptes() {
        return comptes;
    }
}
