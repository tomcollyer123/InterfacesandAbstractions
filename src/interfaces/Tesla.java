package interfaces;

public class Tesla implements CarColour, ElectricCar {

	@Override
	public int torque() {
		
		return 1100;
	}

	@Override
	public int naughtToSixty() {
	
		return 2;
	}

	@Override
	public int overNightChargingCost() {
		
		return 9;
	}

	@Override
	public String paintColour() {
	
		return "blue";
	}

	@Override
	public String interiorColour() {
		
		return "white";
	}

	@Override
	public String alloyColour() {
	
		return "white";
	}

}
