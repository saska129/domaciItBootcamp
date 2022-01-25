package d24_01_2022;

public abstract class Ambalaza {
//	Kreirati abstraktnu klasu Ambalaza koja ima:
//		barkod (primer: 328232-2823)
//		naziv artikla
//		neto tezinu
//		bruto tezinu




		protected String barkod;
		protected String nazivArtikla;
		protected double netoTezina;
		protected double brutoTezina;
//		konstuktore (default-ni i sa parametrima)	
		public Ambalaza() {
			super();
		}

		public Ambalaza(String barkod, String nazivArtikla, double netoTezina, double brutoTezina) {
			this.barkod = barkod;
			this.nazivArtikla = nazivArtikla;
			this.netoTezina = netoTezina;
			this.brutoTezina = brutoTezina;
		}
//		gettere i settere
		public String getBarkod() {
			return barkod;
		}

		public void setBarkod(String barkod) {
			this.barkod = barkod;
		}

		public String getNazivArtikla() {
			return nazivArtikla;
		}

		public void setNazivArtikla(String nazivArtikla) {
			this.nazivArtikla = nazivArtikla;
		}

		public double getNetoTezina() {
			return netoTezina;
		}

		public void setNetoTezina(double netoTezina) {
			this.netoTezina = netoTezina;
		}

		public double getBrutoTezina() {
			return brutoTezina;
		}

		public void setBrutoTezina(double brutoTezina) {
			this.brutoTezina = brutoTezina;
		}
//		metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
		public double tezinaPakovanja () {
			return this.brutoTezina - this.netoTezina;
		}
//		abstraktnu metodu koja vraca cenu artikla
		public abstract double cenaArtiklaJe ();
//		abstraktnu metodu stampaj	
		public abstract void stampaj ();
		
		
		
}
