package LabAssignment02Q02FactoryPattern;

public class SpicePlus extends SpiceMobile {

	@Override
	public void prepare() {
		System.out.println("Preparing Spice Plus Mobile");
	}

	@Override
	public void bundle() {
		System.out.println("Bundling Spice Plus Mobile");
	}

	@Override
	public void label() {
		System.out.println("Labeling Spice Plus Mobile");
	}
}
