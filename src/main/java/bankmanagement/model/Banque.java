package bankmanagement.model;


import java.util.HashSet;

public class Banque {
    private int id;
    private String nom;
    public  static HashSet<Client> clients=new HashSet<>();


    public void stockerClient(Client client)
    {
      clients.add(client);
        System.out.println("Le client " + client.getNom() + " a été enregistré avec succès !");
    }


}
