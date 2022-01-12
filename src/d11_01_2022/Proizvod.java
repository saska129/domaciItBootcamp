package d11_01_2022;

public class Proizvod {
//	Napisati  Proizvod koja ima atribute
//	naziv proizvoda (String)povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu. Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
	//	cenu proizvoda (double)
//	težinu proizvoda u gramima. (double)
//		i metode:
//	stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}

//	povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu. Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.

	//	vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, a povratnu vrednost je cena proizvoda kada se uračuna popust.Ova funkcije ne menja atribut cena. Smatrati da je parametar popust u opsegu od 0 do 100.
//	racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe. Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:	
//	za tezinu do 100g, postarina iznosi 200din
//	za tezinu od 101g do 500g, postarina iznosi 400din
//	za tezinu preko 500g, postarina iznosi 1000din

	String naziv;
	double cena;
	double tezinaUGr;

	public void stampaj() {
		System.out.println("Naziv: " + this.naziv + ", cena: " + this.cena + ", tezina u gramima: " + this.tezinaUGr);
	}
	public void povecajCenu(double povecanje) {
		this.cena = this.cena + povecanje;
	}
	public double vratiCenuSaPopustom (double popustUProcentima) {
		return (cena *(100 - popustUProcentima)) / 100;
		
	}
	public int racunajPostarinu () {
		int postarina = 0;
		if (this.tezinaUGr <= 100 ) {
			postarina = 200;
		} else if (this.tezinaUGr <= 500 ) {
			postarina = 400;
		} else {
			postarina = 1000;
		}
		return postarina;
	}
}
