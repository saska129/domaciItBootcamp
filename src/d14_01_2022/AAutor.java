package d14_01_2022;

public class AAutor {
//	Kreirati klasu Autor koja ima
//	-ime i prezime
//	-konstuktore koje mislite da su vam potrebni
//	-gettere i settere za atribute
//	-metodu print koja stampa u formatu:
//	(ime autora) (prezime autora)

	private String ime;
	private String prezime;

	
	public AAutor(String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;
	}
	public String getIme () {
		return this.ime;
	}
	public String getPrezime () {
		return this.prezime;
	}

}
