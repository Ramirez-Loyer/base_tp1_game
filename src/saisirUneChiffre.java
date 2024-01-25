/*TP 1 : [BaseTP1Game] Ecrire un programme demandant à l'utilisateur s'il souhaite jouer à notre jeu, si non alors sortir du programme, si oui, alors proposer de saisir un chiffre entre 1 et 100 et dire à chaque itération si le chiffre est plus petit ou plus grand. Une fois le chiffre trouvé, afficher un message : vous avez trouvé en x coups !
Attention, vous devez r�aliser le programme en un minimum de lignes de codes tout en veillant à ce qu’il reste parfaitement lisible, enfin que ce soit intuitif pour un autre dev.
- Puis rendre le jeu permanent tant que le joueur veut jouer, il doit pouvoir continuer
NB : la m�thode Math.random() permet de renvoyer une valeur comprise entre 0 et 0,9*/


import java.util.Scanner;
import java.util.Random;

public class saisirUneChiffre {

	public static void main(String[] args) {
		
		Scanner YesNo = new Scanner(System.in);
		boolean replay = true;
		
			System.out.println("Bonjour, tu veux jouer ? O/N)");                	// 1. DEMANDER A L'UTILISATEUR S'IL VEUT JOUER
			
			String yesno = YesNo.next();	// Initialisation m�thode Scanner
		
			if(yesno.equalsIgnoreCase("O")){										// Instruction if...else  /  O => true
																					// La m�thode equalsIgnoreCase compare deux strings en ignorant les majuscules/miniscules
				System.out.println("Ecris un nombre entre 1 et 100");		    	// 2. DEMANDER A L'UTILISATEUR D'ECRIRE UN NOMBRE ENTRE 1 ET 100
					
					int nbrRandom = (int) (Math.random()*100 +1);					//La m�thode Math.random() permet de renvoyer une valeur comprise entre 0 et 0,9, il faut donc multiplier * 100 (0-99) + 1 (1-100)
					int counter = 1, nbrEntered =0;									// 2 variables : counter => fois jou�s, nbrEntered => nombre saisi
					
					while (nbrEntered != nbrRandom) {								// BOUCLE : Tant que le nombre écrit est différent du nombre généré aléatoirement
						nbrEntered = YesNo.nextInt();								// l'utilisateur doit saisir un autre 
						if(nbrEntered > nbrRandom)								
							System.out.println("Ecris un nombre plus petit");   	// Si ce nouveau nombre est inférieure à celui généré aléatoirement alors l'utilisateur soit écrire une valeur plus petite
						else if(nbrEntered < nbrRandom)
							System.out.println("Ecris un nombre plus grand ");  	// Si ce nouveau nombre est supérieur à celui généré aléatoirement alors l'utilisateur soit écrire une valeur plus grande
						else System.out.println("Tu as trouvé en " + counter + " coups"); 
						counter++;
					
					}																// Si l'utilisateur trouve le nombre le jeu s'arrête et un phrase lui indique le nombre de coups joués / Concatenation -counter
					
					System.out.println(nbrRandom);
			} else if (yesno.equalsIgnoreCase("N")) {                               // Si l'utilisateur répond N, le jeu s'arrete, phrase "Au revoir"
    					System.out.println("Au revoir ");
    					}                                                               		
			
		System.out.println("Tu veux rejouer ? O/N ");
		if (yesno.equalsIgnoreCase("O") ) {
			replay = true;
		} else {
			replay = false;
			System.out.println("A bientot");
		
		//while(YesNo)
				{
			//replay }
		
		//if(replay){
			//System.out.println("Je rejoue !!!");	
		//}else {
			//System.out.println("A bientôt");}
	}
	}
	}
}
			
	
	

	

