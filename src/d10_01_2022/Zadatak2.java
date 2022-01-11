package d10_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i za svaki od njih pozvati metodu za stampu

			SmartAirConditioning klima1 = new SmartAirConditioning();
			SmartAirConditioning klima2 = new SmartAirConditioning();
			
			klima1.marka = "Samsung";
			klima1.mod = "greje";
			klima1.temperatura = 35;
			
			klima2.marka = "Galanz";
			klima2.mod = "hladi";
			klima2.temperatura = 18;
			
			klima1.stampaj();
			klima2.stampaj();
	}

}
