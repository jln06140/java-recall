package co.simplon.recall;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exemple {

	public static void main(String[]args) throws ParseException {
		String title = "the lion the witch. and the wardrobe";
			String res="";
			res+= Character.toUpperCase(title.charAt(0));								//premier lettre toujours en majuscule
			for(int i =1; i<title.length()-1; i++) {
				
					char c1 = title.charAt(i);													
					char c2 = title.charAt(i+1);										
					if(!Character.isAlphabetic(c1) && Character.isAlphabetic(c2)) {		//si caractere autre que alphabelet et que suivant alphabet
						res += c1+""+Character.toUpperCase(c2);							//alors on concatene premiere lettre et on met 2eme en capitale
						i++;
					}
					else {
						res+=c1+""+c2;
						i++;
					}
				
			}
			
			System.out.println(res);
			
		}

}
