package LabAssignment01;

public class LuxuryCar extends Car {
	protected LuxuryCar(Location location){
		super(CarType.Luxury,location);
		construct();
	}
	protected void construct() {
		System.out.println("Luxury Car is being created");
	}
}
