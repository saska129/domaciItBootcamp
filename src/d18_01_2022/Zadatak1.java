package d18_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ispit ispit1 = new Ispit("Psihologija", 5, "Pera", "Peric");
		Ispit ispit2 = new Ispit("Pedagogija", 10, "Mika", "Mikic");
		Ispit ispit3 = new Ispit("Sociologija", 8, "Zika", "Zikic");
		
		Student student1 = new Student("123p", "Laza", "Lazic", "osnovne");
		student1.dodajIspit(ispit1);
		student1.dodajIspit(ispit2);
		student1.dodajIspit(ispit3);
		
		student1.stampaj();
	}

}
