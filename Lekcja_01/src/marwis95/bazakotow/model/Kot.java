package marwis95.bazakotow.model;

public class Kot {

	String imie = "Nie mam imienia";
	
	
	public String powiedzCos(String coPowiedziec) {
		return "M�wi�: " + coPowiedziec;
	}
	
	
	public String getImie() {
		return this.imie;
	}
	
	//=============Getter==============
	
	public void setImie(String imie) {
	    this.imie = imie;
	}
	
	//=============Setter==============
	//PPM na klasie -> source -> generate setters and getters
}
