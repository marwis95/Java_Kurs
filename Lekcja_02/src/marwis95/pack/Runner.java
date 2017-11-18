package marwis95.pack;

import java.util.Scanner;
import marwis95.pack.*;

public class Runner {
	
	public static Scanner sc = new Scanner(System.in);
	//Powo³ujê scanner 
	
	public static String getUserInput() {
		return sc.nextLine();
	}
	//W³asna metoda do odczytu scannerem
	
	
	public static void main (String[] args) {
		
		Kot kitku = new Kot();
		
		System.out.println("Wpisz imie kota: ");
		kitku.setImie(getUserInput());
		System.out.println("Wpisz opiekuna kota: ");
		kitku.setOpiekun(getUserInput());
		System.out.println("Kotem: " + kitku.getImie() + " Opiekuje sie: " + kitku.getOpiekun());
		
	}

}
