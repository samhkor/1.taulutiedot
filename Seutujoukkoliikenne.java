/* Taulukon muuttujina kaupunkiseutujen joukkoliikennej�rjestelm�n nimi,
 * siihen kuuluvan kaupunkiseutujen ja keskustaajaman v�kiluku ja kuntien lukum��r�.*/
public class Seutujoukkoliikenne {
	String j�rjestelm�;
	long v�kiluku;
	//long v�kilukuKeskustaajama; (lis�ksi)
	int kuntienLkm;
	
	public Seutujoukkoliikenne(String j�rjestelm�, long v�kiluku, int kuntienLkm) {
		
	}
	
	public String getJ�rjestelm�() {
		return j�rjestelm�;
	}


	public void setJ�rjestelm�(String j�rjestelm�) {
		this.j�rjestelm� = j�rjestelm�;
	}


	public long getV�kiluku() {
		return v�kiluku;
	}


	public void setV�kiluku(long v�kiluku) {
		this.v�kiluku = v�kiluku;
	}


	public int getKuntienLkm() {
		return kuntienLkm;
	}


	public void setKuntienLkm(int kuntienLkm) {
		this.kuntienLkm = kuntienLkm;
	}


	public static void main(String[] args) {
		Seutujoukkoliikenne Tukholma = new Seutujoukkoliikenne("SL: Stockholms Lokaltrafik", 2391990, 26); //Suur-Tukholman/l��nin kunnat, Stor-Stockholms/l�ns kommuner
		Seutujoukkoliikenne K��penhamina = new Seutujoukkoliikenne("DOT: Din offentlige transport/S-tog/K�benhavns Metro", 1856061, 28); //Hovedstadtin kunnat
		Seutujoukkoliikenne Helsinki = new Seutujoukkoliikenne("HSL: Helsingin seudun liikenne", 1587477, 17); //Helsingin seutukunnan kunnat
		Seutujoukkoliikenne Oslo = new Seutujoukkoliikenne("Sporveien Oslo/Ruter/NSB: Norges Statsbaner", 1546706, 31); //Suur-Oslon kunnat
		Seutujoukkoliikenne G�teborg = new Seutujoukkoliikenne("V�sttrafik", 1052288, 13); //Suur-G�teborgin kunnat
		Seutujoukkoliikenne �rhus = new Seutujoukkoliikenne("Midttrafik", 858183, 10); //�stjyllandin amt:n alueen nykyiset kunnat
		Seutujoukkoliikenne Malm� = new Seutujoukkoliikenne("Sk�netrafiken", 750549, 12); //Suur-Malm�n kunnat
		Seutujoukkoliikenne Odense = new Seutujoukkoliikenne("FynBus", 499366, 10); //Fynin saaren kunnat
		Seutujoukkoliikenne Bergen = new Seutujoukkoliikenne("Skyss", 426965, 9); //Suur-Bergenin kunnat
		Seutujoukkoliikenne Tampere = new Seutujoukkoliikenne("Nysse: Tampereen seudun joukkoliikenne", 417580, 11); //Tampereen seutukunnan kunnat
		Seutujoukkoliikenne Aalborg = new Seutujoukkoliikenne("NT: Nordjyllands Trafikselskab", 402310, 6); //Aalborg ja naapurikunnat
		Seutujoukkoliikenne Uppsala = new Seutujoukkoliikenne("UL: Kollektivtrafikf�rvaltningen UL", 389491, 8); //Uppsalan l��nin kunnat
		Seutujoukkoliikenne Stavanger = new Seutujoukkoliikenne("Kolumbus", 347084, 10); //Suur-Stavangerin kunnat
		Seutujoukkoliikenne Turku = new Seutujoukkoliikenne("F�li: Turun seudun joukkoliikenne", 335454, 11); //Turun seutukunnan kunnat
		Seutujoukkoliikenne Trondheim = new Seutujoukkoliikenne("AtB: Tr�ndelag kollektivtrafikk", 310088, 9); //Trondheimin suuralueen kunnat
		Seutujoukkoliikenne Oulu = new Seutujoukkoliikenne("Oulun joukkoliikenne", 255393, 7); //Oulun seutukunnan kunnat
		Seutujoukkoliikenne Reykjavik = new Seutujoukkoliikenne("Str�t� bs", 237470, 7); //Suur-Reykjavikin kunnat
		//Kaupunkiseudut esim. Lahti, Link�ping, Norrk�ping, J�nk�ping, �rebro, Karlstad, G�vle, Esbjerg
		
	}

}

/*String[] sarakkeet = {"id",
		"kaupunkiseutu",
		"v�kiluku", 
		"kuntien m��r�", 
		"joukkoliikennej�rjestelm�"};*/

/*Object[] seututiedot = {
		{"01", "Tukholma", "2391990", "26","SL: Stockholms Lokaltrafik"}
		};*/
