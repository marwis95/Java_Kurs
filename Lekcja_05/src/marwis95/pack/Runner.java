package marwis95.pack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Runner {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<String>();
		lista.add("Pierwszy_list");
		lista.add("Drugi_list");
		lista.add("Drugi_list");
		System.out.println(lista.get(0) + " " + lista.get(1) + " " + lista.get(2));
		
		//=====================Lista==========================
		
		Set<String> zbior = new HashSet<String>();
		zbior.add("Pierwszy_zb");
		zbior.add("Drugi_zb");
		for(String wyraz : zbior) {
			System.out.println(wyraz);
		}
		
		//=======Zbior (sortuje wg dlugosci stringa)=========
		
		Queue<String> kolejka = new ArrayDeque<String>();
		kolejka.add("Pierwszy_kol");
		kolejka.add("Drigi_kol");
		System.out.println(kolejka.peek());//Wypisz poczatkowy
		System.out.println(kolejka.remove());//Wypisz i usun poczatkowy
		System.out.println(kolejka.remove());//Wypisz i usun obecny poczatkowy(czyt. drugi)
		
		//====================Kolejka========================
		
		Map<String, Integer> mapa = new HashMap<String, Integer>();
		mapa.put("Pierwszy", 1);
		mapa.put("Drugi", 2);
		System.out.println(mapa.get("Pierwszy"));
		
		//====Mapa - przechowuje wartosc dla danego klucza====

		
	}
	
}
