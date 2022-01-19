package d17_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Naravno u glavnom kreirati objekte i testirati funkcionalnosti 

		Racun racun1 = new Racun("4646464646", "Pera", "Peric", 10000);
		Racun racun2 = new Racun("2121212121", "Mika", "Mikic", 0);
		
//		Transakcija transakcija1 = new Transakcija(1, racun1, racun2);
//		double vrednostTransakcije = 1000;
//		transakcija1.izvrsiTransakciju(vrednostTransakcije);
//		transakcija1.stampaj();
//		System.out.println();
//		Transakcija transakcija2 = new Transakcija(1, racun1, racun2);
//		vrednostTransakcije = 5000;
//		transakcija2.izvrsiTransakciju(vrednostTransakcije);
//		transakcija2.stampaj();
//		System.out.println();
		Transakcija transakcija3 = new Transakcija(1, racun2, racun1);
		double vrednostTransakcije = 1000;
		transakcija3.izvrsiTransakciju(vrednostTransakcije);
		transakcija3.stampaj();

	}

}
