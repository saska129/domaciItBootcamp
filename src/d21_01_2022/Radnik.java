package d21_01_2022;

import java.util.ArrayList;

public abstract class Radnik {
//	Kreirati abstraktnu klasu Radnik koja ima:
//	 ime i prezime
//	 niz sektora u kojima radi
	private String imeIPrezime;
	
	ArrayList<Sektor> nizSektora = new ArrayList<Sektor>();
	


public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public ArrayList<Sektor> getNizSektora() {
		return nizSektora;
	}

	public void setNizSektora(ArrayList<Sektor> nizSektora) {
		this.nizSektora = nizSektora;
	}

	//	 metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom
	public void zaposliUSektor(Sektor sektor) {
		nizSektora.add(sektor);
	}
//	 abstraktnu metodu koja vraca platu radnika
	
	public abstract double plataJe ();

	public Radnik() {
		super();
	}

	public Radnik(String imeIPrezime) {
		super();
		this.imeIPrezime = imeIPrezime;
	}
		
	
	}
