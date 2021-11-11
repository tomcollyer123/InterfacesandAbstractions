package interfaces;

public class Porsche implements PetrolCar, CarColour {

	@Override
	public String paintColour() {
		
		return "green";
	}

	@Override
	public String interiorColour() {
		
		return "black";
	}

	@Override
	public String alloyColour() {
		
		return "gold";
	}

	@Override
	public double engineSize() {
	
		return 2.5;
	}

	@Override
	public String fuelType() {
		
		return "petrol";
	}

	@Override
	public int costToRefuel() {
		
		return 105;
	}

}
