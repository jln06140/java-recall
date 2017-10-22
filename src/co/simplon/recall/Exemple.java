package co.simplon.recall;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Exemple {

	public static void main(String[]args) throws ParseException {
		
		String[] arrayIn = {"1", "3", "50", "4", "1", "2", "6", "2", "10", "3", "7"};
		String []tab = getElementsLowerThanSix(arrayIn);
		
		for (String s : tab) {
			System.out.println(s);
		}
		
		
		
		
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
		
		
		
		
		
//		String title = "the lion the witch and the wardrobe";
//		String res="";
//		String the="";
//		int iterateur =1;
//		boolean notAlphFound = false;
//		
//		if(Character.isAlphabetic(title.charAt(0))) res +=Character.toUpperCase(title.charAt(0));
//		else iterateur = 0;
//		
//		for(int i =iterateur; i<title.length(); i++) {
//			char c= title.charAt(i);
//			if(title.charAt(i) == 't') the+= title.charAt(i);
//			else if(the.equals("t") && c == 'h') the+=c;
//			else if(the.equals("th") && c == 'e') the+=c;
//			if (the.equals("the"))
//		}

	

}
