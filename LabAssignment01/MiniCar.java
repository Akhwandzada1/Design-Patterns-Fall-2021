package LabAssignment01;

public class MiniCar extends Car {
	MiniCar(Location location){
		super(CarType.Mini,location);
		construct();
	}
	
	protected void construct() {
		System.out.println("Mini Car is being created");
	}
}
