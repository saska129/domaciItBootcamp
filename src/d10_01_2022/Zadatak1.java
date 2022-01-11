package d10_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metodu za stampu.

		Proizvod prvi = new Proizvod();
		Proizvod drugi = new Proizvod();

		prvi.naziv = "Jaffa";
		prvi.cena = 100.2;
		prvi.tezinaUGr= 150;
		
		drugi.naziv = "Munchmallow";
		drugi.cena = 150.2;
		drugi.tezinaUGr= 200;
		
		prvi.stampaj();
		drugi.stampaj();
	}

}
