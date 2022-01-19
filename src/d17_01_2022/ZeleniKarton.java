package d17_01_2022;

public class ZeleniKarton {
//	Zadatak
//	Kreirati klasu ZeleniKarton koja ima:
//	ime i prezime studenta 
//	broj indeksa 
//	naziv predmeta
//	ime i prezime profesora
//	ocenu - od 5 do 10
//	gettere i settere
//	konstruktore

	
	private String imeStudenta;
	private String prezimeStudenta;
	private String brIndeksa;
	private String nazivPredmeta;
	private String imeProfesora;
	private String prezimeProfesora;
	private double ocena;
	
	

	
	public double getOcena() {
		return ocena;
	}


	public void setOcena(int ocena) {
		this.ocena = ocena;
	}


	public String getImeStudenta() {
		return imeStudenta;
	}


	public String getPrezimeStudenta() {
		return prezimeStudenta;
	}


	public String getBrIndeksa() {
		return brIndeksa;
	}


	public String getNazivPredmeta() {
		return nazivPredmeta;
	}


	public String getImeProfesora() {
		return imeProfesora;
	}


	public String getPrezimeProfesora() {
		return prezimeProfesora;
	}
	

public ZeleniKarton(String imeStudenta, String prezimeStudenta, String brIndeksa, String nazivPredmeta,
			String imeProfesora, String prezimeProfesora) {
		super();
		this.imeStudenta = imeStudenta;
		this.prezimeStudenta = prezimeStudenta;
		this.brIndeksa = brIndeksa;
		this.nazivPredmeta = nazivPredmeta;
		this.imeProfesora = imeProfesora;
		this.prezimeProfesora = prezimeProfesora;
	}
// moze metoda prijavi ispit koja to generise, pa se doda ocena


//	metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
	public boolean ispitPolozen() {
		return (this.ocena > 5) ? true : false;
	}

		
public ZeleniKarton(String imeStudenta, String prezimeStudenta, String brIndeksa, String nazivPredmeta,
		String imeProfesora, String prezimeProfesora, double ocena) {
	super();
	this.imeStudenta = imeStudenta;
	this.prezimeStudenta = prezimeStudenta;
	this.brIndeksa = brIndeksa;
	this.nazivPredmeta = nazivPredmeta;
	this.imeProfesora = imeProfesora;
	this.prezimeProfesora = prezimeProfesora;
	this.ocena = ocena;
}


//	metodu stampaj koja stampa podatke u formatu:
//			(naziv predmeta) - (ocena)
//			Student: ime i prezime, broj indeksa
//			Profesor: ime i prezime
	public void stampaj () {
		System.out.println(this.nazivPredmeta + " - " + this.ocena);
		System.out.println("Student: " + this.imeStudenta + " " + this.prezimeStudenta + ", " + this.brIndeksa);
		System.out.println("Profesor: " + this.imeProfesora + " " + this.prezimeProfesora);
	}
	
}
