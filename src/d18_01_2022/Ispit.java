package d18_01_2022;

public class Ispit {
//	Napisati klasu Ispit koja ima
//	naziv predmeta
//	ocenu (u rasponu od 5 do 10)
//	Ime i prezime profesora koji predaje predmet
	private String nazivPredmeta;
	private int ocena;
	private String imeProf;
	private String prezimeProf;
	
//	gettere i settere za sve atribute
	public String getNazivPredmeta() {
		return nazivPredmeta;
	}
	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}
	public int getOcena() {
		return ocena;
	}
	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	public String getImeProf() {
		return imeProf;
	}
	public void setImeProf(String imeProf) {
		this.imeProf = imeProf;
	}
	public String getPrezimeProf() {
		return prezimeProf;
	}
	public void setPrezimeProf(String prezimeProf) {
		this.prezimeProf = prezimeProf;
	}
	
//	konstuktore koje mislite da ce vam trebati
	
	public Ispit(String nazivPredmeta, int ocena, String imeProf, String prezimeProf) {
		super();
		this.nazivPredmeta = nazivPredmeta;
		this.ocena = ocena;
		this.imeProf = imeProf;
		this.prezimeProf = prezimeProf;
	}
	
//	metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
	public boolean ispitJePolozen() {
		return(this.ocena> 5 ) ? true : false;
	}
	
//	metodu koja stampa ispit u formatu:
//	(naziv predmeta) - (profesor) - (ocena)

	public void stampaj () {
		System.out.println( this.nazivPredmeta + " - " + this.imeProf + " " + this.prezimeProf + " - " + this.ocena);
	}
}
