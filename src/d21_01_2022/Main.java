package d21_01_2022;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	U glavnom programu kreirati jednog magacionera i jednog menadzera, postaviti sektore u kojima rade i ispisati platu za svakog	
		
		Sektor s1 = new Sektor("prodaja", 10000);
		Sektor s2 = new Sektor("pabavka", 20000);
		Sektor s3 = new Sektor("hr", 30000);
		
		Menadzer men1 = new Menadzer();
		men1.setImeIPrezime("Menadzer Menadzeric");
		men1.zaposliUSektor(s1);
		men1.zaposliUSektor(s3);
		
		
		Magacioner mag1 = new Magacioner("Magacioner Magacioneric");
		mag1.zaposliUSektor(s1);
		mag1.zaposliUSektor(s2);
		mag1.plataJe();
		
		System.out.println(men1.getImeIPrezime()  + " ima platu koja iznosi " + men1.plataJe());
		System.out.println(mag1.getImeIPrezime()  + " ima platu koja iznosi " + mag1.plataJe());
	}

}
