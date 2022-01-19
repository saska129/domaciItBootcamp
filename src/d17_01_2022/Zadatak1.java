package d17_01_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		U glavnoj klasi:
//			kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//			(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//			(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita

			Scanner s = new Scanner (System.in);
			ArrayList <ZeleniKarton> listaKartona = new ArrayList <ZeleniKarton> ();
			
			System.out.println("Unesi broj studenata na ispitu: ");
			int brKartona = s.nextInt();
			
			for (int i = 0; i < brKartona; i++) {
				System.out.print("Unesi ime studenta: ");
				String imeStudenta = s.next();
				System.out.print("Unesi prezime studenta: ");
				String prezimeStudenta = s.next();
				System.out.print("Unesi broj indeksa: ");
				String brIndeksa = s.next();
				System.out.print("Unesi naziv predmeta: ");
				String nazivPredmeta = s.next();
				System.out.print("Unesi ime profesora: ");
				String imeProfesora = s.next();
				System.out.print("Unesi prezime profesora: ");
				String prezimeProfesora = s.next();
				System.out.print("Unesi ocenu: ");
				double ocena = s.nextDouble();
				ZeleniKarton karton = new ZeleniKarton(imeStudenta, prezimeStudenta, brIndeksa, nazivPredmeta, imeProfesora, prezimeProfesora, ocena);	
				listaKartona.add(karton);
			}

	for(int i = 0;i<listaKartona.size();i++) {
		listaKartona.get(i).stampaj();
		}

	System.out.println("Prosecna ocena je "+ prosecnaOcena(listaKartona));
	System.out.println("Prosecna ocena polozenih ispita je " + prosecnaOcenaPolozenih(listaKartona));
			
			}

	public static double prosecnaOcena(ArrayList<ZeleniKarton> listaKartona) {
		double zbirOcena = 0;
		int brojac = 0;
		for (int i = 0; i < listaKartona.size() ; i++) {
			zbirOcena = zbirOcena + listaKartona.get(i).getOcena();
			brojac ++;
		}
		return zbirOcena / brojac;
	}
		
	
	public static double prosecnaOcenaPolozenih(ArrayList<ZeleniKarton> listaKartona) {
		double zbirOcena = 0;
		int brojac = 0;
		for (int i = 0; i < listaKartona.size() ; i++) {
			if (listaKartona.get(i).getOcena() > 5) {
				zbirOcena = zbirOcena + listaKartona.get(i).getOcena();
				brojac ++;
			}
		}
		return zbirOcena / brojac;
}
}