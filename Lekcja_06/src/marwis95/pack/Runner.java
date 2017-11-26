package marwis95.pack;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<String>();
		lista.add("Pierwszy");
		lista.add("Inny");
		lista.add("Pierwszy");
		
		for (String string : lista) {
			System.out.println(string);
		}
		
		List<String> lista2 = new ArrayList<String>();
		lista2.add("1");
		lista2.add("2");
		
		lista.addAll(lista2); //³¹czenie dwóch list
		
		System.out.println("");
		for (String string : lista) {
			System.out.println(string);
		}
		
		try {
		System.out.println("GET: " + lista.get(5));
		}catch (IndexOutOfBoundsException IOOFBE) {
			System.out.println("Poza zasiegiem");
		} //pobieranie elementu z listy
		
		
		System.out.println("Usun: " + lista.remove(1));
		System.out.println("Usunieto: " + lista.get(1));
		//usuwanie, po usuniêciu lista siê "zsuwa"
		
		System.out.println("Lista size: " + lista.size());
		System.out.println("Lista2 size: " + lista2.size());
		
	}
	
	
}
