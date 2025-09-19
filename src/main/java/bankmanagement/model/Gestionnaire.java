package  bankmanagement.model;

import java.util.ArrayList;

public class Gestionnaire extends Personne
{

   private int  idGestionnaire;
   ArrayList<Integer> ArrayList=new ArrayList<Integer>();
   public Gestionnaire(String nom, String prenom, String email, String motDePasse, int idGestionnaire){
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