package co.simplon.recall;

import java.util.*;

public class PlayingWithAlgo {
	
	public static String helloWorld(String name) {
		// TODO Auto-generated method stub
		String message;
		//message = name == "" ? "Hello World": "Hello "+name;
		if (name == "")
			message = "Hello World";
		else
			message = "Hello " + name;
		return message;
	}

	
	//fonction retourne element 1 et 3 d'un tableau dans un arraylist
	
	public static List<String> selectElementsStartingWithA(String array[]) {
		ArrayList <String> liste = new ArrayList<String> ();
		for (int i=0 ; i<array.length; i++) {
			if(array[i].charAt(0) == 'a' )liste.add(array[i]);
		}
		
		return liste;
	}

	//fonction retourne arraylist si voyelle dans tableau
	
	public static List<String> selectElementsStartingWithVowel(String array[]) {
		ArrayList <String> liste = new ArrayList <String>();
		for (int i=0 ; i<array.length; i++) {
			char c = array[i].charAt(i);
			if(c == 'a'  || c =='e' || c =='i' || c =='o' || c =='u'  || c =='y' )liste.add(array[i]);
		}
		
		return liste;
	}

	
	//fonction qui retourne tableau en enlevant les casses "null"
	public static String[] removeNullElements(String array[]) {
		ArrayList <String> liste = new ArrayList <String>();
		
		int cpt=0;
		for(int i =0; i<array.length; i++) {
			if (array[i] != null ) {
				liste.add(array[i]);
				cpt++;
			}
			
		}
		String tab [] = new String [cpt];
		liste.toArray(tab);
		
		return tab;
	}

	
	//inverse lettre de chaque element du tableau
	public static String[] reverseWordsInMyStringArray(String array[]) {
		String tab [] = new String [array.length];
		String mot="";
		int taille = 0;
		
		for(int i = 0 ; i< array.length ; i++) {
			taille = array[i].length();
			for(int j= taille-1 ; j>=0; j--) {
				mot += array[i].charAt(j);
			}
			tab[i] = mot;
			mot="";
		}
		
		
		return tab;
	}

	//fonction qui inverse ordre tableau
	public static String[] reverseOrderInArray(String array[]) {
		String tab[] = new String [array.length];
		int taille = array.length-1;
		for(int i=0; i<array.length; i++) {
			tab[i] = array[taille];
			taille--;
		}
		return tab;
	}

	public static String[][] everyPossiblePair(String array[]) {
		return null;
	}

	
	//classe tableau en string par rapport a sa derniere lettre
	public static List<String> sortByLastLetter(String array[]) {
		ArrayList <String> liste = new ArrayList<String>();
		char c,c2;
		
		for(int i=0; i< array.length-1; i++) {
			
			for(int j = (i+1); j<array.length ;j++) {
				c = array[i].charAt(array[i].length() -1);
				c2=array[j].charAt(array[j].length() -1);
				if (c2 < c) {
					String temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		for(int i=0; i<array.length; i++) {
			liste.add(array[i]);
		}
		
		
		return liste;
	}
	
	
	//renvoie la moitié du mot
	public static String getFirstHalf(String string) {
		double taille = string.length();
		double d = Math.ceil(taille /2);
		int n = (int)d;
		
		String res = string.substring(0, n);
		return res;
	}

	//ecrit mots contenant lettres passées en parametre
	public static String exportWordWithoutALetter(String array[], char letter) {
		String res ="";
		String concatene = "";
		char c,t1;
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length(); j++) {
				c= array[i].charAt(j);
				if (Character.isLowerCase(c)) t1 = Character.toUpperCase(c);
				else t1 = Character.toLowerCase(c);
				
				if(array[i].charAt(i) == c  ||  array[i].charAt(i) == t1) {
					concatene = "";
					break;
				}
				else concatene += array[i].charAt(j);
			}
			res += concatene+", ";
			
		}
		res = res.substring(0, res.length()-2);
		
		
		return res;
	}

	public static int numberOfPalindromeWord(String text) {
	
		String tab[] = text.split("'");								//cree un tableau en splitant avec '
		int indice=0,cpt=0;
		boolean palindrome = true;
		
		for(int i=0; i<tab.length; i++) {							//on parcourt chaque indice du tableau
			for(int j = tab[i].length()-1; j>=0; j-- ) {
				if((tab[i].charAt(j) != tab[i].charAt(indice)) || tab[i].charAt(j) == ',') {				//compare chaque caratere en partant fin du mot avec ceux partant du debut
					palindrome = false;																		//et que caractere different de la virgule
				}
				indice++;
			}
			if (palindrome) cpt++;
			else palindrome = true;
			indice=0;
		}
		
		
		
		return cpt;
	}

	public static int numberOfPalindromeText(String text) {
		String tab[] = text.split(",");
		for(int i=0; i<tab.length; i++) {								//on eneleve tous les caractere autres que lettre et on les met dans un tableau
			tab[i] = tab[i].replaceAll("[^a-zA-Z]", "");
			System.out.println(tab[i]);
			
		}
		
		boolean pal = true;
		int ind =0;
		int cpt=0;
		
		for(int i=0; i<tab.length; i++) {								//comparaison de chaque element
			for(int j=tab[i].length()-1; j>=0; j--) {
				if(Character.toLowerCase(tab[i].charAt(j)) != Character.toLowerCase(tab[i].charAt(ind))) {		//si caractere premier egal avec le dernier et ainsi de suite
					pal = false;
				}
				ind++;
			}
			if(pal) {
				cpt++;
			}
			
			ind=0;
			pal=true;
		}
		
		return cpt;
	}

	
	public static String shortestWord(String text) {
		
		String tab[] = text.split(" ");
		int taille = tab[0].length();
		String res = tab[0];
		int ind=0;
		
			for(int j=1; j<tab.length; j++) {
				if(tab[j].length() < taille) {
					taille=tab[j].length();
					res = tab[j];
					
				}
			}
		
		return res;
	}

	public static String longestWord(String text) {
		String res="";
		String retour="";
		ArrayList <String> liste = new ArrayList<String>();
		int indice = 0;
		
		for(int i=0; i<text.length(); i++) {					//on va traiter chaque caractere de la chaine passée en parametre
			char c= text.charAt(i);								//si caractere	
			if( Character.isLetterOrDigit(c) ) {				//si caractere est une lettre ou chiffre
				res += c;										//on construit un string avec le mot
			}
			else if (!Character.isLetterOrDigit(c)) {			// si ce n'est pas caractere
				if(i == text.length()) break;					//si on atteint le bout de la chaine alors on sort
				else {
					liste.add(res);								//sinon on ajoute chaine obtenur dans une liste et on remet res a 0
					res="";
				}
			}
		}
		
		int n = liste.get(0).length();
		
		
		for(int i=0;i<liste.size();i++) {						//on compare premier element avec les autres
			if (liste.get(i).length() > n) {
				retour = liste.get(i);							//si la suivante plus grande alors on recupere la chaine
				n = liste.get(i).length();						//et on compare les suivante avec celui recupéré
			}
		}
		
		
		
		return retour;
	}
	

	public static String getAllLetters(String[] array) {
		String res="",mot = "",retour="";
		char c;
		boolean retientLettre = true;
		
		for(int i=0;i<array.length;i++) {					//on concatene tous les mots du tableau en une phrase
			mot += array[i];
		}
		
		for(int i=0; i<mot.length(); i++) {				//on compare chaque lettre avec les suivantes
			c = mot.charAt(i);
			for(int j=i+1; j<mot.length(); j++) {
				if(c == mot.charAt(j)) {					//si egalite on ne la retient pas(on retiendra que la derniere lettre identique dans le string) 
					retientLettre = false;
				}
			}
			if (retientLettre) res+=c;						//si pas de lettre identique alors on ecrit la lettre dans une autre variable
			retientLettre =true;
		}
		
		char tab[] = new char[res.length()];
		
		for(int i =0; i<res.length();i++) {					//on met string obtenu dans un tableau de caracteres
			tab[i] = res.charAt(i);
		}
		
		for(int i=0; i< tab.length; i++) {				//on remet ordre alphabetique dans le tableau obtenue precedement et on le met dans une chaine
			for(int j=i+1; j<tab.length ; j++) {
				char c1 = tab[i];
				char c2 = tab[j];
				if (c2<c1) {
					char temp = c1;
					tab[i] = c2;
					tab[j] = temp;
				}
			}
			retour +=tab[i];
		}
		
		
		
		System.out.println(retour);
		return retour;
	}
	
	public static String removeCapitals(String text) {
		return null;
	}
	
	public static String formatDateNicely(String text) {
		return null;
	}
	
	public static String getDomainName(String email) {
		return null;
	}

	public static String titleize(String title) {
		return null;
	}
	
	public static boolean checkForSpecialCharacters(String string) {
		return false;
	}
	
	public static String[] findAnagrams(String name) {
		return null;
	}

	public static int[] letterPosition(String name) {
		return null;
	}
	
	public static long addingTwoNumbers(long number1, long number2) {
		return 0;
	}

	public static long addingThreeNumbers(long number1, long number2, long number3) {
		return 0;
	}

	public static long addingSeveralNumbers(final long... numbers) {
		return 0;
	}

	public static int[] allElementsExceptFirstThree(int array[]) {
		return null;
	}

	public static int[] addElementToBeginning(int array[], int element) {
		return null;
	}

	public static Float makeNegative(Float number) {
		return null;
	}

	public static String[] getElementsLowerThanSix(String[] array) {
		return null;
	}
	
	public static int[] sortTabBySelection(int[] array) {
		return null;
	}
	
	public static int[] sortTabByInsertion(int[] array) {
		return null;
	}

	public static int[] sortTabByBubble(int[] array) {
		return null;
	}
	
	public static int findIndexByDichotomy(int elemet, int[] array) {
		return 0;
	}
	
	public static int roundUp(float number) {
		return 0;
	}

	public static int findLastDayOfMonth(int month, int year) {
		return 0;
	}

	public static int factorial(int number) {
		return 0;
	}

	public static int convertToCelsius(int temperature) {
		return 0;
	}
	
	public static boolean checkIfPair(int number) {
		return false;
	}
	
	public static boolean checkIfPairPairImpair(int number1, int number2, int number3) {
		return false;
	}
	
	public static boolean checkIfSumIsPair(int number1, int number2, int number3) {
		return false;
	}
	
	public static boolean checkIfAllElementsPair(int[] array) {
		return false;
	}
	
	public static ArrayList<Integer> exportAllElementsPair(int[] array) {
		return null;
	}
	
	public static ArrayList<Integer> exportAllUniqueElementsPair(int[] array) {
		return null;
	}
	
	public static boolean checkIfTriangleRectangle(int number1, int number2, int number3) {
		return false;
	}
	
	public static boolean checkSiTuPeuxAcheter(int prix) {
		// t'as 22 euros en monnaies de 2 euros, la machine ne rend pas de monnaie, check si tu peux payer
		return false;
	}
	
	public static boolean checkCase1(double prix, int pourcentDeRemise) {
		// t'as 100 euros, verifie si tu peux acheter l'article solde
		return false;
	}
	
	public static boolean checkCase2(int number1, int number2) {
		// check si une de 2 chiffres, ou leur somme se divise par 7
		return false;
	}
	
	public static boolean checkCase2a(int number1, int number2) {
		// check si une de 2 chiffres mais pas leur somme se divise par 7
		return false;
	}
	
	public static boolean checkCase3(int number1, int number2, int number3) {
		// check si les trois chiffres sont dans l'ordre, soit croissant ou decroissant
		return false;
	}
	
	public static ArrayList<Integer> allElementsExceptFirstAndLast(int array[]) {

		return null;
	}
	
	public static int[] allElementsExceptFirstAndLastInt(int array[]) {
		return null;
	}
	
	
	public static ArrayList<Integer> allElementsWithIndexPair(int array[]) {
		return null;
	}
	
	public static ArrayList<Integer> reverseOrder(int array[]) {
		return null;
	}
	
	public static int[] reverseOrderInt(int array[]) {
		return null;
	}
	
	public static ArrayList<Integer> insertElementInTheMiddleOfAnArray(int array[], int element ) {
		return null;
	}
	
	public static ArrayList<Integer> exportElementsPair( ArrayList<Integer> list ) {
		
		return null;
	}
	
	public static ArrayList<Integer> exportElementsWithIndexPair( ArrayList<Integer> list ) {
		return null;
	}
	
	public static int Addition( HashMap<String, Integer> addition ) {
		return 0;
	}
	
	public static boolean checkIfStringStartsWithA( String word ) {
		return false;
	}
	
	public static boolean checkIfStringStartsWithVowel( String word ) {
		return false;
	}
	
	public static boolean checkIfStringEndsWithS( String word ) {
		return false;
	}
	
	public static String findShortestWord(String[] array ) {
		
		return null;
	}
	
	public static String swapFirstandLastLetter(String array ) {
		
		return null;
	}
	
	public static int[] swapFirstandLastElement(int[] array ) {
		
		return null;
	}

}
