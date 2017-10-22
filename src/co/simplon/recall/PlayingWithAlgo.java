package co.simplon.recall;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
		String res = "";
		
		for(int i=0; i<text.length();i++) {
			if(!Character.isUpperCase(text.charAt(i))) res+=text.charAt(i);
		}
		
		return res;
	}
	
	public static String formatDateNicely(String text) throws ParseException {
		/*SimpleDateFormat dmyFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat dyFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date d = dmyFormat.parse("2016-10-04");
		String res = dyFormat.format(d);*/
		
		String tab[] = text.split("-");
		return (tab[2] +"/"+ tab[1] +"/"+ tab[0]);
		
	}
	
	public static String getDomainName(String email) {
		return null;
	}

	public static String titleize(String title) {
		String res="";
		int iterateur =1;
		boolean notAlphFound = false;
		
		if(Character.isAlphabetic(title.charAt(0))) res +=Character.toUpperCase(title.charAt(0));
		else iterateur = 0;
		
		for(int i =iterateur; i<title.length(); i++) {
			
			while(!Character.isAlphabetic(title.charAt(i)) && i<=title.length()) {
				
				res+=title.charAt(i);
				i++;
				notAlphFound = true;
			}
			
			if(notAlphFound) {
				res+= Character.toUpperCase(title.charAt(i));
				notAlphFound= false;
			}
			else {
				res+=title.charAt(i);
			}
			
		}
		
		return res;
		
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
		return (number1 + number2);
	}

	public static long addingThreeNumbers(long number1, long number2, long number3) {
		return (number1 + number2 +number3);
	}

	public static long addingSeveralNumbers(final long... numbers) {
		int res=0;
		for(long a : numbers) {
			res+=a;
		}
		return res;
	}

	public static int[] allElementsExceptFirstThree(int array[]) {
		int res;
		int []tab = new int [array.length-3];
		for(int i=3; i<array.length;i++) {
			tab[i-3] = array[i];
		}
		return tab;
	}

	public static int[] addElementToBeginning(int array[], int element) {
		int tab[] = new int [array.length+1];
		tab[0] = element;
		for(int i=0; i<array.length; i++) {
			tab[i+1]= array[i];
		}
		return tab;
	}

	public static Float makeNegative(Float number) {
		if(number <0) return number;
		else return (number-(number*2));
	}

	public static String[] getElementsLowerThanSix(String[] array) {
				
		String tab[] = enleveDoublon(new String [cptElementPlusPetitQue7(array)]);
		croissantTab(tab);
		return tab;
		
	
	}
	
	public static String[] enleveDoublon(String[]array) {
		boolean doublon=false;
		ArrayList<String> liste = new ArrayList<String>();
		
		for(int i = 0; i< array.length; i++) {							//on compare chaque element avec les suivants
			for(int j=i+1 ; i< array.length; j++) {						
				if(array[i].equals(array[j])) {
					doublon = true;										//si doublon alors variable doublon = true
				}
			}
			if(!doublon) liste.add(array[i]);							//si il n'a pas de doublon alors on retient element
			else doublon = false;
		}
		
		String[]tab = new String [liste.size()];						//creation d'un tableau identique a la liste;
		
		for(int i=0; i<tab.length; i++) {
			tab[i] = liste.get(i);
		}
		
		return tab;
	}
	
	public static void croissantTab(String tab[]) {
		for(int i=0; i< tab.length-1; i++) {
			for(int j=i+1; j<tab.length; j++) {
				if(Integer.parseInt(tab[j]) > Integer.parseInt(tab[i])) {
					String temp = tab[i];
					tab[i] = tab[j];
					tab[j] = temp;
				}
			}
		}
	}
	
	public static int cptElementPlusPetitQue7(String[] array) {
		int cpt = 0;
		for(String s : array) {
			if(Integer.parseInt(s) < 7) {
				cpt++;
			}
		}
		
		return cpt;
	}
	
	public static int[] sortTabBySelection(int[] array) {
		
		for(int i=0; i<array.length-1; i++) {
			for(int j =i+1; j< array.length; j++) {
				if(array[j] < array[i]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					
				}
			}
		}
		return array;
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
		int arrondi = (int) Math.round(number);
		return arrondi;
	}
	
	public static boolean estBissextile(int annee) {										//fonction qui retourne true si année est bissesxtile
		boolean estBissext = false;
		if ((annee %4 == 0 && annee %100 != 0) || annee % 400 == 0) estBissext = true;
		return estBissext;
	}
	

	public static int findLastDayOfMonth(int month, int year) {
		int dernierJourDuMois= 30;
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) dernierJourDuMois = 31;
		else if(estBissextile(year) && month == 2) dernierJourDuMois = 29;
		else if(month == 2) dernierJourDuMois = 28;
		
		
		return dernierJourDuMois;
	}

	public static int factorial(int number) {
		int res = 1;
		for(int i =2 ; i<=number; i++) res*=i;
		return res;
	}

	public static int convertToCelsius(int temperature) {
		double temp = (double) temperature;
		int enCelcius = (int)Math.ceil((temp - 32) * 5/9);
		return enCelcius;
	}
	
	public static boolean checkIfPair(int number) {
		boolean estPair = false;
		if(number % 2 == 0) estPair = true;
		return estPair;
	}
	
	public static boolean checkIfPairPairImpair(int number1, int number2, int number3) {
		return (checkIfPair(number1) && checkIfPair(number2) && !checkIfPair(number3));
	}
	
	public static boolean checkIfSumIsPair(int number1, int number2, int number3) {
		boolean sommePaire = false;
		if((number1 + number2 + number3) % 2 == 0) sommePaire = true;
		return sommePaire;
	}
	
	public static boolean checkIfAllElementsPair(int[] array) {
		boolean toutPair = true;
		for( int nb : array) {
			if(nb % 2 != 0) toutPair =false;
		}
		return toutPair;
	}
	
	public static ArrayList<Integer> exportAllElementsPair(int[] array) {
		ArrayList<Integer> listePairElem = new ArrayList<Integer>();
		for(int nb : array) {
			if (nb % 2 == 0) listePairElem.add(nb);
		}
		return listePairElem;
	}
	
	public static ArrayList<Integer> exportAllUniqueElementsPair(int[] array) {
		ArrayList<Integer> listeUniquePairElem = new ArrayList<Integer>();
		boolean ignoreChiffre = false;
		for(int i = 0; i< array.length; i++) {									//compare chaque element
			ignoreChiffre = false;
			for(int j = i+1; j<array.length; j++ ) {							//avec elements suivant
				if(array[i] == array[j]) ignoreChiffre = true;					// si element identique trouvé alors on ignore le chiffre a comparer
			}
			if(!ignoreChiffre && array[i]%2 == 0) listeUniquePairElem.add(array[i]);		//sinon on retient ce chiffre comparé si il est pair
		}
		
		return listeUniquePairElem;
	}
	
	public static int plusGrand(int n1,int n2, int n3) {									// fonction qui retourne nombre le plus grand
		int [] tab = {n1, n2, n3};
		int nbPlusGrand = tab[0];
		for (int i = 1; i<tab.length; i++ ) {
			if(nbPlusGrand<tab[i]) nbPlusGrand = tab[i];
		}
		return nbPlusGrand;
	}
	
	public static boolean checkIfTriangleRectangle(int number1, int number2, int number3) {
		boolean estRectangle = false;
		int plusGrandNb = plusGrand(number1, number2, number3);
		if (plusGrandNb == number1) {
			if((number1 * number1) == (number2 * number2) + (number3 * number3)) estRectangle = true;
		}
		else if (plusGrandNb == number2) {
			if((number2 * number2) == (number1 * number1) + (number3 * number3)) estRectangle = true;
		}
		else {
			if((number3 * number3) == (number2 * number2) + (number1 * number1)) estRectangle = true;
		}
	
		return estRectangle;
	}
	
	public static boolean checkSiTuPeuxAcheter(int prix) {
		boolean jePeux = false;
		if(prix <= 22 && prix%2 == 0) jePeux = true;
		// t'as 22 euros en monnaies de 2 euros, la machine ne rend pas de monnaie, check si tu peux payer
		return jePeux;
	}
	
	public static boolean checkCase1(double prix, int pourcentDeRemise) {
		boolean peuxAcheter = false;
		double aDiviser = (double)pourcentDeRemise / 100;
		if(prix * (1 - aDiviser)  <  100) peuxAcheter = true;
		return peuxAcheter;
	}
	
	public static boolean checkCase2(int number1, int number2) {
		boolean divisiblePar7 = false;
		if(number1 % 7 ==0 || number2 % 7 == 0 || (number1 + number2) % 7 == 0) divisiblePar7 = true;
		return divisiblePar7;
	}
	
	public static boolean checkCase2a(int number1, int number2) {
		boolean divisiblePar7 = false;
		if(number1 % 7 == 0 && number2 % 7 == 0 ) divisiblePar7 = false;
		else if (number1 % 7 == 0 || number2 % 7 == 0 ) divisiblePar7 = true;
		return divisiblePar7;
	}
	
	public static boolean checkCase3(int number1, int number2, int number3) {
		boolean bonOrdre = false;
		if(number1 < number2 && number2 < number3) bonOrdre = true;
		else if (number1 > number2 && number2 > number3) bonOrdre = true;
		return bonOrdre;
	}
	
	public static ArrayList<Integer> allElementsExceptFirstAndLast(int array[]) {
		ArrayList<Integer> listeSansFirstAndLast = new ArrayList<Integer>();
		
		for(int i=1; i< array.length-1; i++) {
			listeSansFirstAndLast.add(array[i]);
		}
		return listeSansFirstAndLast;
	}
	
	public static int[] allElementsExceptFirstAndLastInt(int array[]) {
		
		int [] tab = new int [array.length-2];
		
		for(int i=0; i< tab.length; i++) {
			tab[i] = array[i+1];
		}
		
		return tab;
	}
	
	
	public static ArrayList<Integer> allElementsWithIndexPair(int array[]) {
		ArrayList<Integer> listeElemPair = new ArrayList<Integer>();
		for(int i= 0; i<array.length; i++) {
			if(i%2 == 0) listeElemPair.add(array[i]);
		}
		
		return listeElemPair;
	}
	
	public static ArrayList<Integer> reverseOrder(int array[]) {
		ArrayList<Integer> listeInversée = new ArrayList<Integer>();
		
			for(int j =array.length-1; j >=0 ; j--) {
				listeInversée.add(array[j]);
			}
		return listeInversée;
	}
	
	public static int[] reverseOrderInt(int array[]) {
		int [] tableauSortie = new int [array.length];
		int ind = array.length-1;
			for(int j =0; j <array.length ; j++) {						//parcourt la liste en ordre inverse
				tableauSortie[j] = array[ind];							//et ajoute element dans un arraylist a chaque boucle
				ind--;
			}
		return tableauSortie;
	}
	
	public static ArrayList<Integer> insertElementInTheMiddleOfAnArray(int array[], int element ) {
		ArrayList <Integer> listeAvecAjoutMilieu = new ArrayList<Integer>();		//creation arraylist
		double tailleListe = (double)array.length;
		int indice = (int) Math.floor(tailleListe/2);								//on divise taille tableau par 2
		int cpt=0;
		
		for(int t : array) {
			listeAvecAjoutMilieu.add(t);											//on ajoute chaque element du tableau dans arrayliste
			cpt++;																	//on increment cpt pour qu'il corresponde a l'indice arraylist
			if(indice == cpt) listeAvecAjoutMilieu.add(element);					//si compteur egal a l'indice alors on ajoute element
		}
	
		return listeAvecAjoutMilieu;
	}
	
	public static ArrayList<Integer> exportElementsPair( ArrayList<Integer> list ) {
		ArrayList <Integer> listeElemPair = new ArrayList<Integer>();
		for(int i=0; i< list.size(); i++) {
			if (list.get(i)%2 == 0) listeElemPair.add(list.get(i));
		}
		
		return listeElemPair;
	}
	
	public static ArrayList<Integer> exportElementsWithIndexPair( ArrayList<Integer> list ) {
		ArrayList <Integer> listIndPair = new ArrayList<Integer>();
		for(int i=0; i< list.size(); i++) {
			if (i%2 == 0) listIndPair.add(list.get(i));
		}
		
		return listIndPair;
	}
	
	public static int Addition( HashMap<String, Integer> addition ) {
		int somme = 0;
		for (Integer integer : addition) {
			
		}
		return 0;
	}
	
	public static boolean checkIfStringStartsWithA( String word ) {
		char firstChar = word.charAt(0);
		return (firstChar == 'a' || firstChar == 'A');
	}
	
	public static boolean checkIfStringStartsWithVowel( String word ) {
		return estVoyelle(word.charAt(0));
	}
	
	public static boolean estVoyelle(char c) {
		boolean voyelle = false;
		char tab[] = {'a','e','i','o','u','y','A','E','I','O','U','Y'};
		for(char tabVoyelle : tab) {
			if (c == tabVoyelle) voyelle = true;
		}
		return voyelle;
	}
	
	public static boolean checkIfStringEndsWithS( String word ) {
		char lastChar = word.charAt(word.length()-1);
		return (lastChar == 'S' || lastChar == 's');
	}
	
	public static String findShortestWord(String[] array ) {
		int tailleMot = array[0].length();							//je retiens la taille du premier mot
		int indice =0;												//ainsi que son indice
		for(int i=1; i<array.length; i++){
			if(array[i].length() < tailleMot) {						//je compare sa taille avec les suivants
				indice = i;											//des que je trouve une taille plus petite que celle retenue
				tailleMot = array[i].length();
			}														//alors je remplace "taillMot" par nouvelle taille 
		}															//et retiens son indice
		return array[indice];										//et je retourne
		
	}
	
	public static String swapFirstandLastLetter(String array ) {
			String res="";
			
			if(array.length() >1) {
				char fin = array.charAt(array.length()-1);
				char debut = array.charAt(0);
				res+= fin;
				for(int i = 1; i<= array.length()-2; i++) {
					res+=array.charAt(i);
				}
				res+=debut;
			}
			else {
				for(int i=0; i<array.length();i++) {
					res+=array.charAt(i);
				}
			}
			return res;
		
	}
	
	public static int[] swapFirstandLastElement(int[] array ) {
		int [] temp = new int [array.length];
		for(int i =0; i<array.length; i++) {
			temp[i] = array[i];
		}
		
		if(temp.length >2) {
			int tempo = temp[0];
			temp[0] = temp[temp.length-1];
			temp[temp.length-1] = tempo;
		}
		return temp;
	}

}
