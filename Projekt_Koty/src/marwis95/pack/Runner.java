package marwis95.pack;

import java.util.Scanner;

public class Runner {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static String GetUserInput() {
		return sc.nextLine();
	}
	
	public static int wybor;
	
	public static void main(String[] args) {
		
		do {
		wybor = 3;
		System.out.println("Program koty. Wybierz opcje:");
		System.out.println("1.Dodaj kota");
		System.out.println("2.Wyswietl dane o kocie");
		System.out.println("3.Zamknij program");
		
		try {
		wybor = Integer.parseInt(GetUserInput());
		} catch (NumberFormatException NFE) {
			System.out.println("To nie jest cyfra");
		}
		
		System.out.println(wybor);
		
		switch (wybor) {
		case 1:{
			System.out.println("Jeden");
			break;
		}
		
		case 2:{
			System.out.println("Dwa");
			break;
		}
		
		case 3:{
			System.exit(0);
			break;
		}

		default:
			break;
		}
		}while(1==1);
		
	}

}
