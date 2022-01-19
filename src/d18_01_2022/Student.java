package d18_01_2022;

import java.util.ArrayList;

import d18_01_2022.Ispit;

public class Student {
//	Napisati klasu Student koja ima
//	broj indeksa
//	ime i prezime
//	tip studija (osnovne, master, doktorske)
//	niz ispita
	private String brIndeksa;
	private String ime;
	private String prezime;
	private String tipStudija;
	private ArrayList<Ispit> listaIspita = new ArrayList<Ispit>();
	
//	konstuktore koje mislite da ce vam trebati
	public Student(String brIndeksa, String ime, String prezime, String tipStudija) {
		super();
		this.brIndeksa = brIndeksa;
		this.ime = ime;
		this.prezime = prezime;
		this.tipStudija = tipStudija;
	}

//	gettere i settere za indeks, ime i prezime, tip studija
//	getter za niz predmeta
	
	public String getBrIndeksa() {
		return brIndeksa;
	}

	public void setBrIndeksa(String brIndeksa) {
		this.brIndeksa = brIndeksa;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getTipStudija() {
		return tipStudija;
	}

	public void setTipStudija(String tipStudija) {
		this.tipStudija = tipStudija;
	}

	public ArrayList<Ispit> getListaIspita() {
		return listaIspita;
	}
	

	

//	metodu dodaj ispit u niz ispita
	
	public void dodajIspit(Ispit ispit) {
		this.listaIspita.add(ispit);
	}
	
//	metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
	private double prosek () {
		double zbirOcena= 0;
		int brojac = 0;
		for (int i = 0; i < listaIspita.size(); i++) {
			if (this.listaIspita.get(i).getOcena()>5) {
			zbirOcena = zbirOcena + this.listaIspita.get(i).getOcena();
			brojac ++;
			}
		}
		return zbirOcena/brojac;
	}
//	metodu stampaj koja stampa u formatu:
//	(broj indeksa) - (ime i prezime) - (tip studija)
//	Predmeti:
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	Prosecna ocena: (prosecna ocena

	public void stampaj() {
		System.out.println(this.brIndeksa + " - " + this.ime + " " + this.prezime + " - " + this.tipStudija);
		System.out.println("Predmeti:");
		for (int i = 0; i < listaIspita.size(); i++) {
			this.listaIspita.get(i).stampaj();
		}
		System.out.println("Prosecna ocena: " + this.prosek());
	}
}
