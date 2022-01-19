package d17_01_2022;

public class Racun {
//	Kreirati klasu Racun koja ima:
//		broj racuna (npr: 170-289328923-23)
//		ime i prezime osobe
//		trenutno stanje na racunu (npr: 100, 1220)
//		gettere i setter za sve atribute, sem settera za stanje na racunu

			
	private String brRacuna;
	private String imeVlasnika;
	private String prezimeVasnika;
	private double trenutnoStanje;
	public String getBrRacuna() {
		return brRacuna;
	}
	public void setBrRacuna(String brRacuna) {
		this.brRacuna = brRacuna;
	}
	public String getImeVlasnika() {
		return imeVlasnika;
	}
	public void setImeVlasnika(String imeVlasnika) {
		this.imeVlasnika = imeVlasnika;
	}
	public String getPrezimeVasnika() {
		return prezimeVasnika;
	}
	public void setPrezimeVasnika(String prezimeVasnika) {
		this.prezimeVasnika = prezimeVasnika;
	}
	public double getTrenutnoStanje() {
		return trenutnoStanje;
	}
	public Racun(String brRacuna, String imeVlasnika, String prezimeVasnika, double trenutnoStanje) {
		super();
		this.brRacuna = brRacuna;
		this.imeVlasnika = imeVlasnika;
		this.prezimeVasnika = prezimeVasnika;
		this.trenutnoStanje = trenutnoStanje;
	}
//	metodu koja menja stanje na racunu za prosledjenu vrednost (stanje na racunu ne moze da bude manje od nule)
	
	public void promeniStanje (double visinaTransakcije) {
		this.trenutnoStanje = this.trenutnoStanje + visinaTransakcije;
	}
//	metodu koja stampa podatke o racunu u formatu:
//	Ime i prezime  -  broj racuna
//	stanje na racunu je (trenutno stanje) rsd.
	public void stampaj () {
		System.out.println(this.imeVlasnika + " " + this.prezimeVasnika + " - " + this.brRacuna);
		System.out.println("Stanje na racunu je " + this.trenutnoStanje);
	}
	
}
