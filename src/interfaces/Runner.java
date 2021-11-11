package interfaces;


public class Runner {
public static void main(String[] args) {
	

	
	Audi audi = new Audi();
	Porsche porsche = new Porsche();
	Tesla tesla = new Tesla();
	

	System.out.println(audi.engineSize());
	System.out.println(porsche.costToRefuel());
	System.out.println(tesla.torque());
	
	
	

		
	
	
}	
}
