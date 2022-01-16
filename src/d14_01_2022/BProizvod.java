package d14_01_2022;

public class BProizvod {
//	sifru proizvoda
//	naziv proizvoda
//	cenu po kilogramu (cena po funti se ne cuva, ona se racuna)
//	konstuktor koji prima sva tri parametra (sifra, naziv, cena po kilogramu)
//	gettere i settere za sifru i naziv
//	setter za cenu po kilogramu
//	metodu getCenaKg koja vraca cenu za 1 kg proizvoda
//	metodu getCenaLb koja vraca cenu za 1lb prozvoda
//	 		konverzija: 1 kg = 2.2046 lb
//	metodu koja stampa proizvod u formatu:
//	(sifra) - (naziv)
	
	private int sifra;
	private String naziv;
	private double cenaPoKg;
	public BProizvod(int sifra, String naziv, int cenaPoKg) {
		this.sifra = sifra;
		this.naziv = naziv;
		this.cenaPoKg = cenaPoKg;
	}
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public void setCenaPoKg(int cenaPoKg) {
		this.cenaPoKg = cenaPoKg;
	}
	
	public double getCenaPoKg () {
		return this.cenaPoKg;
	}
	
	public double getCenaLB () {
		return 0.453592 * this.cenaPoKg;
	}
	public void stampaj () {
		System.out.println(this.sifra + " - " + this.naziv);
	}
	
	
}
