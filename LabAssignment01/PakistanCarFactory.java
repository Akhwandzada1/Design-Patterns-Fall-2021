package LabAssignment01;

public class PakistanCarFactory implements CarFactory {

	@Override
	public Car createMiniCar() {
		// TODO Auto-generated method stub
		return new MiniCar(Location.Pakistan);
	}

	@Override
	public Car createLuxuryCar() {
		// TODO Auto-generated method stub
		return new LuxuryCar(Location.Pakistan);
	}
	
}
