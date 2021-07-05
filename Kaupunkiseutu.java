/* Totuusarvon käytön harjoittelu Pohjoismaiden suurimpien kaupunkiseutujen
 * raideliikennemuodoista. Ensimmäinen taulukko kaupunkiseutujen joukkoliikenne-
 * järjestelmään kuuluvasta raideliikenteestä. Kaupunkiseutujen väkiluku on > 200 000.
 * Kaupunkiseutujen listaus on niiden suuruusjärjestyksessä.*/

public class Kaupunkiseutu {
	private String nimi;
	private boolean raitiotie;
	private boolean pikaraitiotie;
	private boolean metro;
	private boolean paikallisjuna;
	
	public Kaupunkiseutu(String seudunNimi, boolean onRaitiotie, boolean onPikaraitiotie, boolean onMetro, boolean onPaikallisjuna) {
		nimi = seudunNimi;
		raitiotie = onRaitiotie;
		pikaraitiotie = onPikaraitiotie;
		metro = onMetro;
		paikallisjuna = onPaikallisjuna;
	}

	
	public String getNimi() {
		return nimi;
	}


	public void setNimi(String nimi) {
		this.nimi = nimi;
	}


	public boolean isRaitiotie() {
		return raitiotie;
	}


	public void setRaitiotie(boolean raitiotie) {
		this.raitiotie = raitiotie;
	}


	public boolean isPikaraitiotie() {
		return pikaraitiotie;
	}


	public void setPikaraitiotie(boolean pikaraitiotie) {
		this.pikaraitiotie = pikaraitiotie;
	}


	public boolean isMetro() {
		return metro;
	}


	public void setMetro(boolean metro) {
		this.metro = metro;
	}


	public boolean isPaikallisjuna() {
		return paikallisjuna;
	}


	public void setPaikallisjuna(boolean paikallisjuna) {
		this.paikallisjuna = paikallisjuna;
	}


	public static void main(String[] args) {
		Kaupunkiseutu seutu01 = new Kaupunkiseutu("Tukholma", true, true, true, true);
		Kaupunkiseutu seutu02 = new Kaupunkiseutu("Kööpenhamina", false, true && false, true, true);
		Kaupunkiseutu seutu03 = new Kaupunkiseutu("Helsinki", true, true && false, true, true);
		Kaupunkiseutu seutu04 = new Kaupunkiseutu("Oslo", true, true, true, true);
		Kaupunkiseutu seutu05 = new Kaupunkiseutu("Göteborg", true, true, false, true);
		Kaupunkiseutu seutu06 = new Kaupunkiseutu("Malmö", false, true && false, false, true);
		Kaupunkiseutu seutu07 = new Kaupunkiseutu("Bergen", false, true, false, true);
		Kaupunkiseutu seutu08 = new Kaupunkiseutu("Tampere", false, true, false, true);
		Kaupunkiseutu seutu09 = new Kaupunkiseutu("Århus", false, true, false, true && false);
		Kaupunkiseutu seutu10 = new Kaupunkiseutu("Stavanger", false, false, false, true);
		Kaupunkiseutu seutu11 = new Kaupunkiseutu("Turku", false, false, false, false); //!
		Kaupunkiseutu seutu12 = new Kaupunkiseutu("Odense", false, true, false, true);
		Kaupunkiseutu seutu13 = new Kaupunkiseutu("Aalborg", false, false, false, true);
		Kaupunkiseutu seutu14 = new Kaupunkiseutu("Trondheim", true, false, false, true);
		Kaupunkiseutu seutu15 = new Kaupunkiseutu("Reykjavik", false, false, false, false);
		Kaupunkiseutu seutu16 = new Kaupunkiseutu("Oulu", false, false, false, false);

		System.out.println(seutu01);
		System.out.println(seutu02);
		//...
	}
}
