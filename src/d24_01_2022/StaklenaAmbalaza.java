package d24_01_2022;

public class StaklenaAmbalaza extends Ambalaza{
//	Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//		kaucija za flasu
//		atribut koji kaze da li se za flasu placa kaucija
//		osnovna cena




		private double kaucijaZaFlase;
		private boolean placaSeKaucija;
		private double osnovnaCena;
//		gettere i setter za atribute
		public double getKaucijaZaFlase() {
			return kaucijaZaFlase;
		}
		public void setKaucijaZaFlase(double kaucijaZaFlase) {
			this.kaucijaZaFlase = kaucijaZaFlase;
		}
		public boolean isPlacaSeKaucija() {
			return placaSeKaucija;
		}
		public void setPlacaSeKaucija(boolean placaSeKaucija) {
			this.placaSeKaucija = placaSeKaucija;
		}
		public double getOsnovnaCena() {
			return osnovnaCena;
		}
		public void setOsnovnaCena(double osnovnaCena) {
			this.osnovnaCena = osnovnaCena;
		}
//		konstuktori koji su vam potrebni	
		public StaklenaAmbalaza() {
			super();
		}
		public StaklenaAmbalaza(String barkod, String nazivArtikla, double netoTezina, double brutoTezina, double kaucijaZaFlase, boolean placaSeKaucija, double osnovnaCena) {
			super(barkod, nazivArtikla, netoTezina, brutoTezina);
			this.kaucijaZaFlase = kaucijaZaFlase;
			this.placaSeKaucija = placaSeKaucija;
			this.osnovnaCena = osnovnaCena;
		}

//		racuna cenu
//		ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//		ako se ne placa, (osnovna cena) * 1.2
	
		
		@Override
		public  double cenaArtiklaJe (){
			double cena = 0;
			if(this.placaSeKaucija) {
				cena = this.osnovnaCena*1.2 + this.kaucijaZaFlase;
			} else {
				cena = this.osnovnaCena*1.2;
			}
			return cena;
		}
		
//		metoda stampaj stampa sve podatke iz klase staklena flasa.	
		@Override
		public  void stampaj () {
			System.out.print(this.nazivArtikla + " sa barkodom " + this.barkod + " cija je bruto tezina " + this.brutoTezina
					+ ", a neto " + this.netoTezina + ", za koju se ");
			if(this.placaSeKaucija) {
				System.out.println("placa kaucija, ");
			} else {
				System.out.println("ne placa kaucija, ");
			}
			System.out.println("kosta: " + this.cenaArtiklaJe() + "din.");
			
		}

	
	
}

