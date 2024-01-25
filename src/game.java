/*TP 1 : [BaseTP1Game] Ecrire un programme demandant à  l'utilisateur s'il souhaite jouer à  notre jeu, si non alors sortir du programme, 
si oui, alors proposer de saisir un chiffre entre 1 et 100 et dire à chaque itération si le chiffre est plus petit ou plus grand. 
Une fois le chiffre trouvé, afficher un message : vous avez trouvé en x coups !
Attention, vous devez réaliser le programme en un minimum de lignes de codes tout en veillant à ce qu'il reste parfaitement lisible, 
enfin que ce soit intuitif pour un autre dev.
- Puis rendre le jeu permanent tant que le joueur veut jouer, il doit pouvoir continuer
NB : la méthode Math.random() permet de renvoyer une valeur comprise entre 0 et 0,9*/ 

import java.util.Scanner;

public class game {

	public static void main(String[] args) {

		//boolean = false;

		//Demander à l'utilisateur s'il veut jouer


		System.out.println("Bonjour, tu veux jouer ? (Oui/Non) ");
		Scanner scanner = new Scanner(System.in); 
		if(scanner.next().equalsIgnoreCase("oui")) {

			//L'utilisateur veut continuer alors ici on code le jeu

			int nombreSaisi =0;
			int nbrRandom = (int) (Math.random()*100 +1); //On doit caster car la méthode Math.random() pour convertir les nombres entiers -> nombrs réélles
			int counter = 0;

			System.out.println("Ecris un nombre entre 1 et 100");
			Scanner scanner2 = new Scanner(System.in);


			//Le programme demande de trouver un nombre random
			while (nombreSaisi != nbrRandom ) {
				nombreSaisi = scanner2.nextInt();
				if (nbrRandom > nombreSaisi) {
					System.out.println("Ecris un nombre plus grand");

				} else if (nbrRandom < nombreSaisi) {
					System.out.println("Ecris un nombre plus petit");

				} else {

					System.out.println("Bravo! tu as réussi à trouver le nombre en " +  counter +" coups ! ");

				} 

				counter = counter+1; 
			} //Fin de while


		} //Fin if(scanner.next().equalsIgnoreCase("oui"))  

	} // Fin main
} //fin class



