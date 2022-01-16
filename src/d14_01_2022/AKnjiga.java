package d14_01_2022;

public class AKnjiga {
//	Kreirati klasu Knjiga koji ima:
//		-ISBN
//		-naziv
//		-godina izdanja
//		-autor
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//		(ISBN)
//		(naziv) - (godina izdanja)
//		autor: (ime autora) (prezime autora) 

		private String isbn;
		private String naziv;
		private int godinaIzdanja;
		private AAutor autor;
		public AKnjiga(String isbn, String naziv, int godinaIzdanja, AAutor autor) {
			this.isbn = isbn;
			this.naziv = naziv;
			this.godinaIzdanja = godinaIzdanja;
			this.autor = autor;
		}
		
		public void stampaj() {
			System.out.println(this.isbn);
			System.out.println(this.naziv + " - " + this.godinaIzdanja);
			System.out.println("Autor: " + this.autor.getIme() + " " + this.autor.getPrezime());
		}
		
		
		
}
