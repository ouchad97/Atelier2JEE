package Super.marche.jv;

public class Account {
	private String nom,Adresse;
	private double solde;
	
	
	public Account(String nom, String Adresse,double solde) {
		this.nom = nom;
		this.Adresse = Adresse;
		this.solde=solde;
	}
	
	 public double afficherInfosSolde() {
	        return solde;
	    }
	 public double calculerInterer(double tauxInteret) {
		 tauxInteret = 7.0;
		 double tauxfinal = solde+tauxInteret;
		 return tauxfinal;
	 }
}
