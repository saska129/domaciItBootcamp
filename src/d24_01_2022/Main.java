package d24_01_2022;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih tipova
//		i istestirati sve metode i ispisati ukupnu cenu sa popustom.

		Korpa korpa1 = new Korpa();
		SuperKartica kartica1 = new SuperKartica(1, "Pera Peric", 20);
		
		StaklenaAmbalaza staklo1 = new StaklenaAmbalaza("123-321", "Zajecarsko", 500, 550, 10, true, 200);
		StaklenaAmbalaza staklo2 = new StaklenaAmbalaza("000-000", "Zajecarsko", 500, 550, 10, false, 200);
		Tetrapak tetrapak1 = new Tetrapak("456-654", "Mleko", 1000, 1050, false, 200);
		Tetrapak tetrapak2 = new Tetrapak("000-000", "Mleko", 1000, 1050, true, 200);
		
		korpa1.dodajAmbalazu(tetrapak1);
		korpa1.dodajAmbalazu(tetrapak2);
		korpa1.dodajAmbalazu(staklo1);
		korpa1.dodajAmbalazu(staklo2);
		
		korpa1.stampajArtikleBezPopusta();
		korpa1.izbaciAmbalazu("000-000");
		System.out.println();
		korpa1.stampajArtikleBezPopusta();
		System.out.println();
		
    	double ukupnaCenaKorpe = korpa1.ukupnaCenaKorpe(kartica1);
    	System.out.println("Ukupna cena korpe je " + ukupnaCenaKorpe);


		

		
		
		
	}
}
