package Gerer.compte.clients;

public class CompteClients {

	private String nom,Adresse;
	private double solde;
	
	
	public CompteClients(String nom, String Adresse,double solde) {
		this.nom = nom;
		this.Adresse = Adresse;
		this.solde=solde;
	}
	
	 public String afficherInfosCompte() {
	        return nom +" habitate à ("+Adresse+" ) - infos solde "+solde;
	    }
}
