package d24_01_2022;

public class Tetrapak extends Ambalaza {
//	Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//		atribut koji kaze da li se moze reciklirati
//		osnovna cena



		private boolean seMozeReciklirati;
		private double osnovnaCena;
		
//		gettere i setter za atribute	
		public boolean isSeMozeReciklirati() {
			return seMozeReciklirati;
		}
		public void setSeMozeReciklirati(boolean seMozeReciklirati) {
			this.seMozeReciklirati = seMozeReciklirati;
		}
		public double getOsnovnaCena() {
			return osnovnaCena;
		}
		public void setOsnovnaCena(double osnovnaCena) {
			this.osnovnaCena = osnovnaCena;
		}
		
		
		public Tetrapak(String barkod, String nazivArtikla, double netoTezina, double brutoTezina, boolean seMozeReciklirati, double osnovnaCena) {
			super(barkod, nazivArtikla, netoTezina, brutoTezina);
			this.seMozeReciklirati = seMozeReciklirati;
			this.osnovnaCena = osnovnaCena;
		}
		

//		racuna cenu tako da ispunjava uslova:
//		ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//		ako nije u cenu ulazi samo osnovna cena
		
		@Override
		public  double cenaArtiklaJe (){
			double cena = 0;
			if(this.seMozeReciklirati) {
				cena = super.tezinaPakovanja() * 1.5 + this.osnovnaCena;
			} else {
				cena = this.osnovnaCena;
			}
			return cena;
		}
		
//		metoda stampaj stampa sve podatke iz klase tetrapak.
		@Override
		public  void stampaj () {
			System.out.print(this.nazivArtikla + " sa barkodom " + this.barkod + " cija je bruto tezina " + this.brutoTezina
					+ ", a neto " + this.netoTezina + ", a koji ");
			if(this.seMozeReciklirati) {
				System.out.println("se moze reciklirati, ");
			} else {
				System.out.println("se ne moze reciklirati, ");
			}
			System.out.println("kosta: " + this.cenaArtiklaJe() + "din.");
			
		}

		
	
		
}
