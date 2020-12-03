package Diplome.mention.m;

public class Diplome {
	private String titre, mention;
	private int anobtenu;
	
	public Diplome() {}
	public Diplome(String _titre,String _mention, int _nt) {
		this.titre=_titre;
		this.mention=_mention;
		this.anobtenu=_nt;
	}
	
	public String getTitre() {
		return this.titre; 
	}
	public String getMention() {
		return this.mention;
	}
	public int getNT() {
		return this.anobtenu;
	}
	
	 public void setTitre(String _Titre) {
		    this.titre = _Titre;
		  }
	 public void setMention(String _Montion) {
		    this.mention = _Montion;
		  }
	 public void setNT(int _NT) {
		 this.anobtenu= _NT;
	 }
}
