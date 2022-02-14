package d24_01_2022;

import java.util.ArrayList;

public class Korpa {

//	Kreirati klasu Korpa koja ima:
//		niz ambalaza
//		metodu dodaj ambalazu



	ArrayList<Ambalaza> listaAmbalaza = new ArrayList<Ambalaza>();
	
	public void dodajAmbalazu (Ambalaza ambalaza) {
		listaAmbalaza.add(ambalaza);
	}
//	metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
	public void izbaciAmbalazu (String barkod) {
		for (int i = 0; i < listaAmbalaza.size(); i++) {
			if (listaAmbalaza.get(i).getBarkod().equals(barkod)) {
				listaAmbalaza.remove(i);
			}
			
		}
	}
//	privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust. 
	
	private double[] cenaSvihAmbalazaSaPopustom (int popust) {
		double [] cenaAmbalaze = new double [listaAmbalaza.size()];
		
		for (int i = 0; i < listaAmbalaza.size(); i++) {
			cenaAmbalaze[i] = listaAmbalaza.get(i).cenaArtiklaJe() - popust;
		}
		return cenaAmbalaze;
	}
//	metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze),
//	kao parametar funkcije se prima Super karticu iz koje se cita popust.
	
	public double ukupnaCenaKorpe (SuperKartica kartica) {
		double cenaKorpe = 0;
		double [] nizCena = cenaSvihAmbalazaSaPopustom(kartica.getPopust());
		for (int i = 0; i < nizCena.length; i++) {
			cenaKorpe = cenaKorpe + nizCena[i];
		}
		return cenaKorpe;
	}
	

	
	public void stampajArtikleBezPopusta() {
		for (int i = 0; i < listaAmbalaza.size(); i++) {
			listaAmbalaza.get(i).stampaj();
		}
	}
}
