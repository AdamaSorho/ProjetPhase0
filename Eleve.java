class Eleve extends Classe {
	private String nomEleve;
	private String prenomEleve;
	
	//Le contructeur de la classe eleve
	public Eleve(String nomClasse, String nomEleve, String prenomEleve) {
		
		super(nomClasse);
		this.nomEleve = nomEleve;
		this.prenomEleve = prenomEleve;
	}
	
	public void affiche() {
		/*
		 * Vérifie si le nombre de caractères du nom de l'élève vaut 15, sinon 
		 * complète avec de l'espace
		 */
		if(nomEleve.length() < 18) {
			for(int i = nomEleve.length(); i <= 18; ++i) {
				nomEleve += " ";
			}
		}
		
		System.out.println(nomEleve + "                 " + prenomEleve);
	}
}