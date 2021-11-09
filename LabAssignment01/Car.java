package LabAssignment01;

public abstract class Car {
	Location location=null;
	CarType model=null;
	
	public Car(CarType model,Location location) {
		
	}
	abstract void construct();
	
	void setModel(CarType model) {
		this.model=model;
	}
	CarType getModel() {
		return model;
	}
	void setLocation(Location location) {
		this.location=location;
	}
	Location getLocation() {
		return location;
	}
	public String toString() {
		return "Car Model"+model+"location"+location;
	}
}
