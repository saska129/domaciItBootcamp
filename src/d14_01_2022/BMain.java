package d14_01_2022;

import java.util.Scanner;

public class BMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner (System.in);
		System.out.println("Unesi merne jedinice (kg ili lb): ");
		String merneJedinice = s.next();
		System.out.println("Unesi tezinu: ");
		int tezina = s.nextInt();
		
		
		BProizvod proizvod1 = new BProizvod (252, "jabuke", 100);
		BVaga merenje1 = new BVaga();
		merenje1.setMereneJedinice(merneJedinice);
		merenje1.setProizvod(proizvod1);
		merenje1.sracunajCenu(tezina);
		merenje1.stampaj(tezina);
		
	}

}
