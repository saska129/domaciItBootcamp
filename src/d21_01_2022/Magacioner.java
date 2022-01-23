package d21_01_2022;

public class Magacioner extends Radnik{

//	Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//		 ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//		 suma plata svih sektor / broj sektora * 0.5
//		 override uje metodu za platu, tako da se plata racuna po formuli:
//		(prosecna plata za sve sektore u kojima radi) * (broj sektora).
	
	private double prosekPlataZaSektore() {
		int sumaPlataSvihSektora = 0;
		int brojac = 0;
		for (int i = 0; i < this.nizSektora.size(); i++) {
			sumaPlataSvihSektora = sumaPlataSvihSektora + this.getNizSektora().get(i).getPlata();
				brojac ++;
			}
		return sumaPlataSvihSektora/brojac *0.5;
		
	}
	
	public Magacioner(String imeIPrezime) {
		super(imeIPrezime);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double plataJe () {
		return prosekPlataZaSektore()* this.nizSektora.size();
		
	}
}
