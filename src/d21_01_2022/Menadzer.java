package d21_01_2022;

public class Menadzer extends Radnik {
//	Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//	 override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.
	
	@Override
	public double plataJe() {
		int sumaPlata = 0;
		for (int i = 0; i < this.nizSektora.size(); i++) {
			sumaPlata = sumaPlata + this.nizSektora.get(i).getPlata();
		}
		return sumaPlata;
	}

	public Menadzer() {
		super();
		// TODO Auto-generated constructor stub
	}
}
