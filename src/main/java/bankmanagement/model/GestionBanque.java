package  bankmanagement.model;

 public class GestionBanque extends Personne
{

   private int  idGestionnaire;
   public GestionBanque(String nom, String prenom, String email,String motDePasse,int idGestionnaire){
       super(nom, prenom, email, motDePasse);
       this.idGestionnaire=idGestionnaire;
   }

    public int getIdGestionnaire() {
        return idGestionnaire;
    }
    public void setIdGestionnaire(int idGestionnaire) {
        this.idGestionnaire = idGestionnaire;
    }
}