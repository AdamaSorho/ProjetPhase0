abstract class Classe {
	private String nomClasse;
	
	//Le constructeur de la classe classe
	public Classe(String nomClasse) {
		
		this.nomClasse = nomClasse;
	}
	//Le setter
	public void setNomClasse(String c) {
		nomClasse = c;
	}
	//Le getter
	public String getNomClasse() {
		return nomClasse;
	}
	
	public abstract void affiche();
}