package LabAssignment02Q02FactoryPattern;

public abstract class MobileFactory {
	public MobileFactory() {
		
	}
	public abstract SpiceMobile constructMobile(String makemodel);
	public SpiceMobile produceMobile(String makemodel) {
		SpiceMobile mobile = constructMobile(makemodel);
		mobile.prepare();
		mobile.bundle();
		mobile.label();
		return mobile;
	}
}
