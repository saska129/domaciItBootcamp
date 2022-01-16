package d14_01_2022;

public class BVaga {
//	Kreirati klasu Vaga koja ima:
//		merna jedinica (kg ili lb)
//		proizvod (proizvod koji se meri)
//		default-ni konstuktor
//		getteri i setteri za sve atribute
//		metodu sracunajCenu koja vraca cenu proizvoda za unetu tezinu (tezina je parametar funkcije). Na racunanje cene utice i merna jedinica na koju je vaga podesena. 
//		metodu stampaj koja stampa racun u formatu:
//		               (sifra) - (naziv)
//		   (cena za odgovarajucu mernu jedinicu) (merna jedinica) x (tezina) 
//		   Ukupno: (ukupna cen

	private String mereneJedinice;
	private BProizvod proizvod;
	public BVaga() {	
	}
	public String getMereneJedinice() {
		return mereneJedinice;
	}
	public void setMereneJedinice(String mereneJedinice) {
		this.mereneJedinice = mereneJedinice;
	}
	public BProizvod getProizvod() {
		return proizvod;
	}
	public void setProizvod(BProizvod proizvod) {
		this.proizvod = proizvod;
	}
	public double sracunajCenu (int tezina) {
		double cena=0;
		if (this.mereneJedinice.equals("kg")) {
			cena = this.getProizvod().getCenaPoKg() * tezina;
		} else {
			cena = this.getProizvod().getCenaLB() *tezina;
		}
		return cena;
	}
	public void stampaj (int tezina) {
		double cenaZaMernuJedinicu;
		if(this.mereneJedinice.equals("kg")) {
			cenaZaMernuJedinicu = this.getProizvod().getCenaPoKg();
		} else {
			cenaZaMernuJedinicu = this.getProizvod().getCenaLB();
		}
		this.proizvod.stampaj();
		System.out.println(cenaZaMernuJedinicu + " dinara po " + this.getMereneJedinice() + " * " + tezina + this.getMereneJedinice());
		System.out.println("Ukupno: " + this.sracunajCenu(tezina) + " din.");
	}
	
	
	
}
