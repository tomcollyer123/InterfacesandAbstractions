package interfaces;

public class Audi implements CarColour, PetrolCar {

	@Override
	public double engineSize() {
		
		return 1.8;
	}

	@Override
	public String fuelType() {
		
		return "petrol";
	}

	@Override
	public int costToRefuel() {
	
		return 80;
	}

	@Override
	public String paintColour() {
		
		return "blue";
	}

	@Override
	public String interiorColour() {
	
		return "orange";
	}

	@Override
	public String alloyColour() {

		return "black";
	}

}
