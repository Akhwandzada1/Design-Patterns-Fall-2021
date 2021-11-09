package LabAssignment02Q02FactoryPattern;

public class SpiceFire extends SpiceMobile {

	@Override
	public void prepare() {
		System.out.println("Preparing Spice Fire Mobile");
	}

	@Override
	public void bundle() {
		System.out.println("Bundling Spice Fire Mobile");
	}

	@Override
	public void label() {
		System.out.println("Labeling Spice Fire Mobile");
	}

}
