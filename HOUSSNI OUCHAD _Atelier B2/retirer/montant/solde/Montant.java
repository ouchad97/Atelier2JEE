package retirer.montant.solde;

public class Montant {


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
	
	//Methode
	public void retirer(double m) {
		if(m>solde) {
			System.out.println("Impossible retirer plus que le montant de votre solde");
		}
		else {solde-=m;}
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
