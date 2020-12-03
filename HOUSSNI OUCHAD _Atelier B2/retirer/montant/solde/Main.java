package retirer.montant.solde;

public class Main {
		public static void main(String args[]) {
			Montant c = new Montant();
			c.setNom("Ali");
			c.setAdresse("Safi");
			c.setSolde(123.2);
			c.retirer(100.2);
			 System.out.println(c.getNom()+" "+c.getAdresse()+" "+c.getSolde());
		}
}
