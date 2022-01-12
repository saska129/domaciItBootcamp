package d11_01_2022;

import d11_01_2022.SmartAirConditioning;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartAirConditioning klima1 = new SmartAirConditioning();
		SmartAirConditioning klima2 = new SmartAirConditioning();
		
		klima1.marka = "Samsung";
		klima1.mod = "greje";
		klima1.temperatura = 35;
		klima1.potrosnjaDokGreje = 2;
		klima1.potrosnjaDokHladi = 1;
		
		klima2.marka = "Galanz";
		klima2.mod = "hladi";
		klima2.temperatura = 18;
		klima2.potrosnjaDokGreje = 2;
		klima2.potrosnjaDokHladi = 1;
		
		klima1.stampaj();
		System.out.println("Cena rada klime za mesec dana iznosi: " + klima1.racunZaMesec());
		System.out.println();
		klima2.stampaj();
		System.out.println("Cena rada klime za mesec dana iznosi: " + klima2.racunZaMesec());
	}

}
