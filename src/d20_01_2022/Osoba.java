package d20_01_2022;

import java.util.Scanner;

public class Osoba {

	Scanner s = new Scanner(System.in);
//	Kreirati klasu Osoba koja ima:
//		ime i prezime
//		jmbg
//		godinu rodjenja


 


//	default-ni konstuktor
	protected String ime;
	protected String prezime;
	protected String jmbg;
	protected int godinaRodjenja;
	
	public Osoba() {
		
	}
	
//	konstuktor sa parametrima
	public Osoba(String ime, String prezime, String jmbg, int godinaRodjenja) {
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
		this.godinaRodjenja = godinaRodjenja;
	}
	
//	gettere i settere
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		prezime = prezime;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public int getGodinaRodjenja() {
		return godinaRodjenja;
	}

	public void setGodinaRodjenja(int godinaRodjenja) {
		this.godinaRodjenja = godinaRodjenja;
	}
	
//	metodu stampaj koja stampa u formatu:
//	(ime i prezime), (jmbg), (godina rodjenja)
	
	public void stampaj() {
		System.out.println("Ime i prezime: " + this.ime + " " + this.prezime + ", jmbg: " + this.jmbg + ", godina rodjnja: " + this.godinaRodjenja);
	}

		public void unesiPodatke() {
			System.out.print("Unesi ime :");
			ime = s.next();
			System.out.print("Unesi prezime :");
			prezime = s.next();
			System.out.print("Unesi jmbg :");
			jmbg = s.next();
			System.out.print("Unesi godinu rodjena :");
			godinaRodjenja = s.nextInt();
			
		}
	
	
	
	

}
