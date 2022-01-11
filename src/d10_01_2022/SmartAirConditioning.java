package d10_01_2022;

public class SmartAirConditioning {
//	Kreirati klasu SmartAirConditioning koja ima:
//		atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//		atribut za izabranu temperaturu (minimum je 16, maksimum 35)
//		atribut za mod (hladi/greje)
//		metodu za stampu - stampa u formatu 

		String marka;
		int temperatura;
		String mod;
		
		public void stampaj(){
			System.out.println(this.marka + ", " + this.temperatura + ", " + this.mod);
		}
}
