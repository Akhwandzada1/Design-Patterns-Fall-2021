package LabAssignment01;

public class EuropeCarFactory implements CarFactory {

	@Override
	public Car createMiniCar() {
		return new MiniCar(Location.Europe);
	}

	@Override
	public Car createLuxuryCar() {
		return new LuxuryCar(Location.Europe);
	}
	
}
