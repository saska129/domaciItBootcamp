package d11_01_2022;

import d11_01_2022.Proizvod;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Proizvod prvi = new Proizvod();
		Proizvod drugi = new Proizvod();

		prvi.naziv = "Jaffa";
		prvi.cena = 100.2;
		prvi.tezinaUGr= 150;
		
		drugi.naziv = "Munchmallow";
		drugi.cena = 150.2;
		drugi.tezinaUGr= 200;
		
		prvi.stampaj();
		System.out.println("Cena sa popustom od 10% za " + prvi.naziv + " iznosi "+ prvi.vratiCenuSaPopustom(10));
		prvi.povecajCenu(10);
		System.out.println("Kada se cena poveca za 10 din za " + prvi.naziv + " onda iznosi "+ prvi.cena);
		System.out.println("Postarina za ovaj proizvod iznosi: " + prvi.racunajPostarinu());
		System.out.println();
		drugi.stampaj();
		System.out.println("Cena sa popustom od 10% za " + drugi.naziv + " iznosi "+ drugi.vratiCenuSaPopustom(10));
		drugi.povecajCenu(10);
		System.out.println("Kada se cena poveca za 10 din za " + drugi.naziv + " onda iznosi "+ drugi.cena);
		System.out.println("Postarina za ovaj proizvod iznosi: " + drugi.racunajPostarinu());
		
		
	}

}
