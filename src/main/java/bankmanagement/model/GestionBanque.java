package  bankmanagement.model;

 public class GestionBanque extends Personne
{

   private int  idGestionnaire;

   public GestionBanque(char nom, char prenom, char email, int idGestionnaire){
       super(nom, prenom, email);
       this.idGestionnaire=idGestionnaire;
   }

    public int getIdGestionnaire() {
        return idGestionnaire;
    }
    public void setIdGestionnaire(int idGestionnaire) {
        this.idGestionnaire = idGestionnaire;
    }
}