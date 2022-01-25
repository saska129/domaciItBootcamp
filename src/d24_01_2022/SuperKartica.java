package d24_01_2022;

public class SuperKartica {
//	Kreirati klasu SuperKartica koja ima:
//		broj kartice
//		ime i prezime vlasnika
//		popust (200, 500, … )



	private int brKartice;
	private String imeIPrezimeVlasnika;
	private int popust;
	
//	konstuktore (default-ni i sa parametrima)	
	public SuperKartica() {
		
	}

	public SuperKartica(int brKartice, String imeIPrezimeVlasnika, int popust) {
		this.brKartice = brKartice;
		this.imeIPrezimeVlasnika = imeIPrezimeVlasnika;
		this.popust = popust;
	}
//	gettere i settere 

	public int getBrKartice() {
		return brKartice;
	}

	public void setBrKartice(int brKartice) {
		this.brKartice = brKartice;
	}

	public String getImeIPrezimeVlasnika() {
		return imeIPrezimeVlasnika;
	}

	public void setImeIPrezimeVlasnika(String imeIPrezimeVlasnika) {
		this.imeIPrezimeVlasnika = imeIPrezimeVlasnika;
	}

	public int getPopust() {
		return popust;
	}

	public void setPopust(int popust) {
		this.popust = popust;
	}

//	metodu stampaj koja stampa karticu u formatu:
//	(broj kartice), (ime i prezime)
	
	public void stampaj() {
		System.out.println(this.brKartice + " - " + this.imeIPrezimeVlasnika);
	}
	
}
