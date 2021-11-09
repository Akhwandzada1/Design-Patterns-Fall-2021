package LabAssignment02Q02FactoryPattern;

public class SpiceBolt extends SpiceMobile {

	@Override
	public void prepare() {
		System.out.println("Preparing Spice Bolt Mobile");
	}

	@Override
	public void bundle() {
		System.out.println("Bundling Spice Bolt Mobile");
	}

	@Override
	public void label() {
		System.out.println("Labeling Spice Bolt Mobile");
	}
	
}
