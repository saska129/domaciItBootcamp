package d20_01_2022;

public class Igrac extends Osoba {
//	Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//		broj (broj koji igrac nosi)
//		poziciju koju igra (odbrambeni, napadac, … )
//		kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)



//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu

	private int brojDresa;
	private String pozicija;
	private boolean jeKapiten;
	
//	default-ni konstuktor	
	public Igrac() {
		super();
	}
//	konstuktor sa parametrima
	public Igrac(String ime, String prezime, String jmbg, int godinaRodjenja, int brojDresa, String pozicija, boolean jeKapiten ) {
		super(ime, prezime, jmbg, godinaRodjenja);
		this.brojDresa = brojDresa;
		this.pozicija = pozicija;
		this.jeKapiten = jeKapiten;
	}
	
//	gettere i settere za broj, kapiten i poziciju	
	public int getBrojDresa() {
		return brojDresa;
	}
	public void setBrojDresa(int brojDresa) {
		this.brojDresa = brojDresa;
	}
	public String getPozicija() {
		return pozicija;
	}
	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}
	public boolean isJeKapiten() {
		return jeKapiten;
	}
	public void setJeKapiten(boolean jeKapiten) {
		this.jeKapiten = jeKapiten;
	}

//	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
	
	@Override
	public void stampaj() {
		super.stampaj();
		System.out.print("Ovaj igrac nosi broj: " + this.brojDresa + ", igra na poziciji: " + this.pozicija + "i ");
		if (this.jeKapiten) {
			System.out.println("kapiten je.");
		} else {
			System.out.println("nije kapiten.");
		}
	}
	
	@Override
	public void unesiPodatke() {
		super.unesiPodatke();
		System.out.print("Unesi broj dresa koji igrac nosi:");
		brojDresa = s.nextInt();
		System.out.print("Unesi poziciju na koji igrac igra:");
		pozicija = s.next();
		System.out.print("Da li je igrac kapiten (true ili false):");
		jeKapiten = s.nextBoolean();
			
			
	}
	
}
