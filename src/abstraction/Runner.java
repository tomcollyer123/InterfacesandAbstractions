package abstraction;

public class Runner {

	public static void main(String[] args) {
		
		Bird bird = new Penguin();
		
		
		System.out.println(bird.flight());
		System.out.println(bird.makeNoise());
		
		
		
		
	}
	
}
