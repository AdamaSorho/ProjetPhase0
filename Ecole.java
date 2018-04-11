import java.util.ArrayList;

//La direction de l'ecole
class Ecole {
	private ArrayList <Classe> personne = new ArrayList<Classe>();
	
	//Méthode ajoutant un(e) nouvel(le) élève
	public void add(Classe eleve) {
		
		if(eleve != null) {
			personne.add(eleve);
		}
	}
	
	//Affichage des élèves
	public void afficherEleves(String nomClasse) {
		
		System.out.println("Les élèves de la classe " + nomClasse + " Sont :");
		System.out.println(" NOM :                            PRENOM(S) :");
		for(Classe eleve : personne) {
			eleve.affiche();
		}
	}
}