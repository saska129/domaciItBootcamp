package d11_01_2022;

public class SmartAirConditioning {

//	atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//	atribut za potrosnju elektricne energije dok hladi (npr 1kW/h)
//	atribut za potrosnju elektricne energije dok greje (npr 2kW/h)
//	atribut za izabranu temperaturu (minimum je 16, maksimum 35)
//	atribut za mod (hladi/greje)
//	metodu za stampu - stampa u formatu 
//	marka - mod - termperatura
//	metodu koja racuna mesecnu potrosnju u kW/h, po formuli:
//	30 * 15 * potrosnja po satu ( zavisi da li greje ili hladi)
//	metodu koja racuna koliko klima novca potrosi za mesec dana
//	Prvih 350 kW/h su u zelenoj zoni i 1 kW/h kosta 6din
//	Sve ostalo se racuna kao u plavoj zoni, gde 1kW/h kosta 9 dinara
//	Metoda vraca ukupnu cenu za taj mesec

	
	String marka;
	int potrosnjaDokHladi;
	int potrosnjaDokGreje;
	int temperatura;
	String mod;
	
	public void stampaj(){
		System.out.println("Marka: " + this.marka + "; izabrana temperatura: " + this.temperatura + "; mod: " + this.mod);
	}
	public int mesecnaPotrosnja () {
		int mesecnaPotrosnja = 0;
		if (this.mod.equals("greje")) {
			mesecnaPotrosnja= 30*15*this.potrosnjaDokGreje;
		} else {
			mesecnaPotrosnja= 30*15*this.potrosnjaDokHladi;
		}
		return mesecnaPotrosnja;
	}
	public int racunZaMesec() {
		int racunZaMesec = 0;
		int mesecnaPotrosnja = this.mesecnaPotrosnja();
		if (mesecnaPotrosnja<= 350) {
			racunZaMesec = mesecnaPotrosnja * 6;
		} else {
			racunZaMesec = 350*6 + (mesecnaPotrosnja - 350) * 9;
		}
		return racunZaMesec;
		
	}
}
