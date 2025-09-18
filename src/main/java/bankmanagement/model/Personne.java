package bankmanagement.model;

abstract class Personne {

    protected  String nom;
    protected String prenom;
    protected String email;
    protected String motDePasse;

    //getters & setters nom

    public String getNom() {
        return nom;

    }
    public void setNom(String nom) {
        this.nom = nom;
    }



    //getters & setters prenom
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    //getters & setters email
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    //getters & setters motDePasse
    public String getMotDePasse() {
        return motDePasse;
    }
    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
}