package d10_01_2022;

public class Proizvod {
//	Napisati klasu Proizvod koja ima atribute
//	naziv proizvoda (String)
//	cenu proizvoda (double)
//	težinu proizvoda u gramima. (double)
//		i metode:
//	stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
	
	String naziv;
	double cena;
	double tezinaUGr;

	public void stampaj() {
		System.out.println(this.naziv + ", " + this.cena + ", " + this.tezinaUGr);
	}
}