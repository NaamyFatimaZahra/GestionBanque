package bankmanagement.model;

abstract class Personne {

    protected char nom;
    protected char prenom;
    protected char email;
    protected char motDePasse;

    public Personne(char nom, char prenom, char email) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;

    }


    //getters & setters nom
    public char getNom() {
        return nom;

    }
    public void setNom(char nom) {
        this.nom = nom;
    }



    //getters & setters prenom
    public char getPrenom() {
        return prenom;
    }
    public void setPrenom(char prenom) {
        this.prenom = prenom;
    }

    //getters & setters email
    public char getEmail() {
        return email;
    }
    public void setEmail(char email) {
        this.email = email;
    }

    //getters & setters motDePasse
    public char getMotDePasse() {
        return motDePasse;
    }
    public void setMotDePasse(char motDePasse) {
        this.motDePasse = motDePasse;
    }
}