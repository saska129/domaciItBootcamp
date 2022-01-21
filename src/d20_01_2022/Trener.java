package d20_01_2022;

public class Trener extends Osoba {
//	Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//		godine iskustva
//		tip trenera (kondicioni, za igru, pomocni, personalni)
//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
	
	private int godIskusta;
	private String tip;
	
	public Trener() {
		super();
	}

	public Trener(String ime, String prezime, String jmbg, int godinaRodjenja, int godIskusta, String tip) {
		super(ime, prezime, jmbg, godinaRodjenja);
		this.godIskusta = godIskusta;
		this.tip = tip;
	}

	public int getGodIskusta() {
		return godIskusta;
	}

	public void setGodIskusta(int godIskusta) {
		this.godIskusta = godIskusta;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	@Override
	public void stampaj() {
		super.stampaj();
		System.out.println("Ovaj trener je " + this.tip + " i ima " + this.godIskusta + " godina iskustva");
	}
	
	@Override
	public void unesiPodatke() {
		super.unesiPodatke();
		System.out.print("Unesi koliko godina iskustva ima trener:");
		godIskusta = s.nextInt();
		System.out.print("Koji je tip trenara:");
		tip = s.next();
	}
}
