package LabAssignment02Q02FactoryPattern;

public abstract class SpiceMobile {
	double price;
	public SpiceMobile() {
		
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public double getPrice() {
		return price;
	}
	public abstract void prepare();
	public abstract void bundle();
	public abstract void label();
}
