package co.simplon.recall;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exemple2 {
	public static void main(String[]args) {
		int debut=0;
		String email = "spike@makersacademy.com";
		Pattern p = Pattern.compile("^[@]");
		Matcher match = p.matcher(email);
		while (match.find()) {
			System.out.println(match.groupCount());
		debut = match.start();
		}
		System.out.println(debut);
	
	
	}
	
	
	
	public static List<String> selectElementsStartingWithVowel(String array[]) {
		ArrayList <String> liste = new ArrayList <String>();
		for (int i=0 ; i<array.length; i++) {
			char c = array[i].charAt(0);
			if(c == 'a'  || c =='e' || c =='i' || c =='o' || c =='u'  || c =='y' )liste.add(array[i]);
		}
		
		return liste;
	}
	
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

}
