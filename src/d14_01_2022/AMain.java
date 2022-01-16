package d14_01_2022;

public class AMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AAutor autor1 = new AAutor("Miomir", "Petrovic");
		AAutor autor2 = new AAutor("Haruki", "Murakami");
		AKnjiga knjiga1 = new AKnjiga("978-86-521-4181-4", "Sredisnja Pustinja", 2021, autor1);
		AKnjiga knjiga2 = new AKnjiga("978-86-6145-289-5", "Ubistvo Komtura", 2018, autor2);
		
		knjiga1.stampaj();
		System.out.println();
		knjiga2.stampaj();
	}

}
