package getters.setters.account;

public class Compte {
	private String nom,Adresse;
	private double solde;
	
	
	
	// Getter
	public String getNom() {
	    return this.nom;
	  }
	public String getAdresse() {
	    return this.Adresse;
	  }
	public double getSolde() {
	    return this.solde;
	  }
	

	  // Setter
	 public void setNom(String _nom) {
		    this.nom = _nom;
		  }
	 public void setAdresse(String _Adresse) {
		    this.Adresse = _Adresse;
		  }
	 public void setSolde(double _Solde) {
		    this.solde = _Solde;
		  }
}