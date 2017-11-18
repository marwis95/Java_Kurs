package marwis95.pack;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Runner {
	
	public static Scanner sc = new Scanner(System.in);
			
	public static String getUserInput() {
		return sc.nextLine();
	}
	
	public static void main(String[] args) {
	
	Pattern pattern	= null;
	Matcher matcher = null;
	String wyrazenie = null;
		
	do {		
		System.out.println("Podaj wyrazenie do sprawdzenia: ");
		wyrazenie = getUserInput();
		
		try {
			pattern = Pattern.compile("abc");
			} catch (PatternSyntaxException pse) {
				System.out.println("Err");
			} 
		
			matcher = pattern.matcher(wyrazenie);
		} while(matcher.matches() == false);
	
	
	
	System.out.println(matcher.matches());

	}
}