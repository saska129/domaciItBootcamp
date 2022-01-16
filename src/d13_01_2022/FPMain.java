package d13_01_2022;

public class FPMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FacebookPost prviPost = new FacebookPost("Pera Peric", "Mika Mikic", "Srecan rodjendan");
		FacebookPost drugiPost = new FacebookPost("Mika Mikic", "Pera Peric", "Hvala!");
		
		prviPost.stampaj();
		prviPost.like();
		prviPost.like();
		prviPost.dislike();
		prviPost.shere();
		prviPost.shere();
		System.out.println();
		prviPost.stampaj();
		System.out.println();
		drugiPost.stampaj();
		drugiPost.like();
		drugiPost.dislike();
		drugiPost.dislike();
		drugiPost.shere();
		System.out.println();
		drugiPost.stampaj();
	}

}
