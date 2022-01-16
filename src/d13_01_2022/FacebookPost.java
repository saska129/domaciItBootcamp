package d13_01_2022;

public class FacebookPost {
//	1.Kreirati klasu FacebookPost koja ima:
//		   Od atributa:
//		ime i prezime korisnika koji je objavio post
//		ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//		tekst objave
//		broj lajkova
//		broj deljenja
//		  Od gettera i settera:
//		korisnik moze da procita bilo koji atribut 
//		ali ne moze da menja broj lajkova i broj deljenja (nemamo settere za ove atribute)
//		 Konstruktore:
//			konstruktori koji su potrebni i logicni
//		  Od metoda:
//		like(), koja povecava broj lajkova za 1.
//		dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//		share(), koja povecava broj deljenja za 1
//		print(), koja stampa objavu u formatu:
//		(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//		(tekst objave)
//		Likes (broj lajkova) | Shares (broj deljenja)

	private String imeIPrezimePostera;
	private String imeIPrezimeNaKojiSePostuje;
	private String tekstObjave;
	private int brLajkova;
	private int brDeljenja;
	
	public String getImeIPrezimePostera() {
		return imeIPrezimePostera;
	}
	public void setImeIPrezimePostera(String imeIPrezimePostera) {
		this.imeIPrezimePostera = imeIPrezimePostera;
	}
	public String getImeIPrezimeNaKojiSePostuje() {
		return imeIPrezimeNaKojiSePostuje;
	}
	public void setImeIPrezimeNaKojiSePostuje(String imeIPrezimeNaKojiSePostuje) {
		this.imeIPrezimeNaKojiSePostuje = imeIPrezimeNaKojiSePostuje;
	}
	public String getTekstObjave() {
		return tekstObjave;
	}
	public void setTekstObjave(String tekstObjave) {
		this.tekstObjave = tekstObjave;
	}
	public int getBrLajkova() {
		return brLajkova;
	}
	public int getBrDeljenja() {
		return brDeljenja;
	}
	
	public FacebookPost(String imeIPrezimePostera, String imeIPrezimeNaKojiSePostuje, String tekstObjave) {
		super();
		this.imeIPrezimePostera = imeIPrezimePostera;
		this.imeIPrezimeNaKojiSePostuje = imeIPrezimeNaKojiSePostuje;
		this.tekstObjave = tekstObjave;
	}
	public void like() {
		this.brLajkova = this.brLajkova + 1;
	}
	public void dislike() {
		this.brLajkova = this.brLajkova - 1;
		if (this.brLajkova < 0) {
			this.brLajkova = 0;
		}
	}
	public void shere() {
		this.brDeljenja = this.brDeljenja + 1;
	}
	public void stampaj () {
		System.out.println(this.imeIPrezimePostera + " >>>> " + this.imeIPrezimeNaKojiSePostuje);
		System.out.println(this.tekstObjave);
		System.out.println("Likes (" + this.brLajkova + ") | Shares (" + this.brDeljenja + ")");
	}
}
