import java.util.Scanner;

public class Projet {
	
	private static Scanner keyb = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//Création d'une instance ecole
		Ecole ecole = new Ecole();
		
		System.out.println("Bonjour, bienvenue sur l'application de gestion du Lycée d'Excellence d'Abidjan !");
		System.out.println();
		
		System.out.println("Entrer le nom d'une classe. ");
		String classe = keyb.nextLine();
		
		String choix;
		
		//Reprend le processus si l'utilisateur veut ajouetr un(e) noul(le) élève
		do {
			System.out.println("Entrer le nom de famille d'un élève dans cette classe ");
			String nom = keyb.nextLine();
			
			System.out.println("Entrer le(s) prénom(s) de l'élève");
			String prenom = keyb.nextLine();
			
			ecole.add(new Eleve(classe, nom, prenom));
			
			System.out.println("Voulez-vous enrégistrer un autre élève dans cette classe ? (o/n) ");
			choix = keyb.nextLine();
			
			//Appel à la méthode choisir
			choix = choisir(choix);
			
		} while(choix.equals("o"));
		
		ecole.afficherEleves(classe);
		
		
	}
	
	//Methode vérifiant si l'utilisateur a entré la bonne lettre, soit 'o' pour oui et 'n' pour non
		public static String choisir(String choix) {
			String monChoix = choix;
			
			while(!monChoix.equals("o") & !monChoix.equals("n")) {
				System.out.println("Appuyer sur 'o' pour oui ou sur 'n' pour non svp !");
				monChoix = keyb.nextLine();
			}
			
			return monChoix;	
		}
}
