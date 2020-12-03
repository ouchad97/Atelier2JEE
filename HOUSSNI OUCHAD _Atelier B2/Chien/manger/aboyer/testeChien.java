package Chien.manger.aboyer;

public class testeChien {
		public static void  main(String args []) {
			
			Chien c1 = new Chien("Rex");
			String colere ="Je suis en colère.Ghhhhhhhhhh !!! WWWWOARF !! WWWWOARF !! -";
			String mangeRx=" Je mange de la viande";
	        System.out.print(c1.aboyer(colere));
	        System.out.println(c1.manger(mangeRx));
	        
	        
	        Chien c2 = new Chien("Max");
			String NONcolere ="Je ne suis pas du tout en colère. Iwiw !! awaw !! -";
			String mangeMx=" Je mange du poisson";
	        System.out.print(c2.aboyer(NONcolere));
	        System.out.println(c2.manger(mangeMx));
			
		}
}
