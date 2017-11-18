package marwis95.pack;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Runner {

	public static void main(String[] args) {
		
		Integer liczba = null;
		try {
		    liczba = Integer.valueOf("abc");
		} catch (NumberFormatException nfe) {
		    System.out.println("Wyj�tek - z�y format liczby");
		} catch (Exception e) {
		    System.out.println("Wyj�tek, ale jaki� inny");
		} finally {
		    System.out.println("To si� zawsze wykonuje");
		}
		
		//===============Obluga wyjatkow========================
		
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		Date date = null;
		try {
			date = sdf.parse("1995.10.10");
		} catch(ParseException pe) {
			System.out.println("Zly format daty");
		}
		
		
		
	}
	
}
