package d20_01_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.
//		(Za vezbanje) U glavnom programu kreirati niz igraca i niz trenera, na kraju programa ispisati sve igrace i trenere.
//		Podatke za igrace i trenere unosi korisnik sa tastature.
		
		
		Scanner s = new Scanner (System.in);
		ArrayList<Igrac> listaIgraca = new ArrayList<Igrac>();
		ArrayList<Trener> listaTrenera = new ArrayList<Trener>();
		
		System.out.println("Koliko ima igraca: ");
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			Igrac igrac = new Igrac();
			igrac.unesiPodatke();
			listaIgraca.add(igrac);	
		}
		
		System.out.println("Koliko ima treneta: ");
		int k = s.nextInt();
		for (int i = 0; i < k; i++) {
			Trener trener = new Trener();
			trener.unesiPodatke();
			listaTrenera.add(trener);	
		}
		if (n != 0) {
			System.out.println("Ovo su igraci: ");
		}
		
		for (int i = 0; i < listaIgraca.size(); i++) {
			System.out.println((0+i) + ". Igrac:");
			listaIgraca.get(i).stampaj();
		}
		if (k != 0) {
			System.out.println("Ovo su igraci: ");
		}
		for (int i = 0; i < listaTrenera.size(); i++) {
			System.out.println((0+i) + ". Trener:");
			listaTrenera.get(i).stampaj();
		}
		
		
		
//		Igrac igrac1 = new Igrac("Pera", "Peric", "05059855465466", 1985, 5, "spic", true);
//		Igrac igrac2 = new Igrac("Mika", "Mikic", "0505985546248", 1985, 10, "odbrana", false);
//		
//		Trener trener1 = new Trener("Zika", "Zikic", "0505958545646", 1958, 30, "glani");
//		Trener trener2 = new Trener("Laza", "Lazic", "050598156566", 1981, 10, "kondicioni");
//		
//		igrac1.stampaj();
//		System.out.println();
//		trener2.stampaj();
	}

}
