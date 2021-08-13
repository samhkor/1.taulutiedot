/* Taulukon muuttujina kaupunkiseutujen joukkoliikennejärjestelmän nimi,
 * siihen kuuluvan kaupunkiseutujen ja keskustaajaman väkiluku ja kuntien lukumäärä.*/
public class Seutujoukkoliikenne {
	String järjestelmä;
	long väkiluku;
	//long väkilukuKeskustaajama; (lisäksi)
	int kuntienLkm;
	
	public Seutujoukkoliikenne(String järjestelmä, long väkiluku, int kuntienLkm) {
		
	}
	
	public String getJärjestelmä() {
		return järjestelmä;
	}


	public void setJärjestelmä(String järjestelmä) {
		this.järjestelmä = järjestelmä;
	}


	public long getVäkiluku() {
		return väkiluku;
	}


	public void setVäkiluku(long väkiluku) {
		this.väkiluku = väkiluku;
	}


	public int getKuntienLkm() {
		return kuntienLkm;
	}


	public void setKuntienLkm(int kuntienLkm) {
		this.kuntienLkm = kuntienLkm;
	}


	public static void main(String[] args) {
		Seutujoukkoliikenne Tukholma = new Seutujoukkoliikenne("SL: Stockholms Lokaltrafik", 2391990, 26); //Suur-Tukholman/läänin kunnat, Stor-Stockholms/läns kommuner
		Seutujoukkoliikenne Kööpenhamina = new Seutujoukkoliikenne("DOT: Din offentlige transport/S-tog/Københavns Metro", 1856061, 28); //Hovedstadtin kunnat
		Seutujoukkoliikenne Helsinki = new Seutujoukkoliikenne("HSL: Helsingin seudun liikenne", 1587477, 17); //Helsingin seutukunnan kunnat
		Seutujoukkoliikenne Oslo = new Seutujoukkoliikenne("Sporveien Oslo/Ruter/NSB: Norges Statsbaner", 1546706, 31); //Suur-Oslon kunnat
		Seutujoukkoliikenne Göteborg = new Seutujoukkoliikenne("Västtrafik", 1052288, 13); //Suur-Göteborgin kunnat
		Seutujoukkoliikenne Århus = new Seutujoukkoliikenne("Midttrafik", 858183, 10); //Østjyllandin amt:n alueen nykyiset kunnat
		Seutujoukkoliikenne Malmö = new Seutujoukkoliikenne("Skånetrafiken", 750549, 12); //Suur-Malmön kunnat
		Seutujoukkoliikenne Odense = new Seutujoukkoliikenne("FynBus", 499366, 10); //Fynin saaren kunnat
		Seutujoukkoliikenne Bergen = new Seutujoukkoliikenne("Skyss", 426965, 9); //Suur-Bergenin kunnat
		Seutujoukkoliikenne Tampere = new Seutujoukkoliikenne("Nysse: Tampereen seudun joukkoliikenne", 417580, 11); //Tampereen seutukunnan kunnat
		Seutujoukkoliikenne Aalborg = new Seutujoukkoliikenne("NT: Nordjyllands Trafikselskab", 402310, 6); //Aalborg ja naapurikunnat
		Seutujoukkoliikenne Uppsala = new Seutujoukkoliikenne("UL: Kollektivtrafikförvaltningen UL", 389491, 8); //Uppsalan läänin kunnat
		Seutujoukkoliikenne Stavanger = new Seutujoukkoliikenne("Kolumbus", 347084, 10); //Suur-Stavangerin kunnat
		Seutujoukkoliikenne Turku = new Seutujoukkoliikenne("Föli: Turun seudun joukkoliikenne", 335454, 11); //Turun seutukunnan kunnat
		Seutujoukkoliikenne Trondheim = new Seutujoukkoliikenne("AtB: Trøndelag kollektivtrafikk", 310088, 9); //Trondheimin suuralueen kunnat
		Seutujoukkoliikenne Oulu = new Seutujoukkoliikenne("Oulun joukkoliikenne", 255393, 7); //Oulun seutukunnan kunnat
		Seutujoukkoliikenne Reykjavik = new Seutujoukkoliikenne("Strætó bs", 237470, 7); //Suur-Reykjavikin kunnat
		//Kaupunkiseudut esim. Lahti, Linköping, Norrköping, Jönköping, Örebro, Karlstad, Gävle, Esbjerg
		
	}

}

/*String[] sarakkeet = {"id",
		"kaupunkiseutu",
		"väkiluku", 
		"kuntien määrä", 
		"joukkoliikennejärjestelmä"};*/

/*Object[] seututiedot = {
		{"01", "Tukholma", "2391990", "26","SL: Stockholms Lokaltrafik"}
		};*/
