package d17_01_2022;

public class Transakcija {
//	Kreirati klasu Transakcija koja ima:
//		id transakcije
//		racun sa kog se prenose sredstva
//		racun na koji se prenose sredstva
	
		private int id;
		private Racun racunSa;
		private Racun racunNa;
//		gettere i settere
//		konstruktore
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public Racun getRacunSa() {
			return racunSa;
		}
		public void setRacunSa(Racun racunSa) {
			this.racunSa = racunSa;
		}
		public Racun getRacunNa() {
			return racunNa;
		}
		public void setRacunNa(Racun racunNa) {
			this.racunNa = racunNa;
		}
		public Transakcija(int id, Racun racunSa, Racun racunNa) {
			super();
			this.id = id;
			this.racunSa = racunSa;
			this.racunNa = racunNa;
		}
		
//		privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
//		ako je prenos sredstava manji od 4500, provizija je fiksna 45
//		ako je prenos sredstava veci od 4500, provizija je 1% 
//		S obzirom da se provizija racuna na osnovu visine transakcije, znaci da metoda prima parametar koji predstavlja visinu transakcije
//		Ukoliko ne znate da resite ovu metodu, u metodi izvrsi transakciju racunajte fiksnu proviziju u vrednosti od 45.
		
		private double provizija (double visinaTransakcije) {
			return (visinaTransakcije < 4500) ? 45 : visinaTransakcije / 100;
		}
		
//		metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi. Kao parametar funkcije se unosi vrednost koja se prebacuje. 
//		Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija), a na drugi racun dodaje samo (trazena suma).
//		(Za vezbanje) Vodite racuna da na racunu sa kog se salju sredstva ima dovoljno sredstava
		public void izvrsiTransakciju (double visinaTransakcije) {
			if (this.racunSa.getTrenutnoStanje() - visinaTransakcije > 0) {
				this.racunSa.promeniStanje(-visinaTransakcije);
				this.racunSa.promeniStanje(- provizija(visinaTransakcije));
				this.racunNa.promeniStanje(visinaTransakcije);
			} else {
				System.out.println("Nema dovoljno novca na raunu.");
			}
		}

		
//		metodu koja stampa podatke o transakciji u formatu:
//		id transkacije
//		Racun sa: Ime i prezime  -  broj racuna
//		Racun na: Ime i prezime  -  broj racuna

		public void stampaj() {
			System.out.println("Id transakcije: " + this.id);
			System.out.print("Racun sa: " );
			this.racunSa.stampaj();
			System.out.print("Racun na: " );
			this.racunNa.stampaj();
		}
}
