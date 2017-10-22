package co.simplon.recall;

public class Exemple2 {
	public static void main(String[]args) {
		
		int [] tab = {3, 5, 2};
		int nbPlusGrand = tab[0];
		for (int i = 1; i<tab.length; i++ ) {
			if(nbPlusGrand<tab[i]) nbPlusGrand = tab[i];
		}
		System.out.println(nbPlusGrand);
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
	
	public static void affiche(int [] c) {
		for(int i =0; i< c.length; i++ ) {
			System.out.println(c[i]);
		}
	}

}
