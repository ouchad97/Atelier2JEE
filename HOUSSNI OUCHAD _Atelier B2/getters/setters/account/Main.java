package getters.setters.account;

public class Main {
		public static void main(String args[]) {
			Compte c = new Compte();
			c.setNom("Ali");
			c.setAdresse("Safi");
			c.setSolde(123.2);
			 System.out.println(c.getNom()+" "+c.getAdresse()+" "+c.getSolde());
		}
}
