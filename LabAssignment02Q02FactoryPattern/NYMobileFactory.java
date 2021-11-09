package LabAssignment02Q02FactoryPattern;

public class NYMobileFactory extends MobileFactory {

	@Override
	public SpiceMobile constructMobile(String makemodel) {
		SpiceMobile mobile = null;
		if(makemodel.equalsIgnoreCase("SpiceFire")){
			mobile = new SpicePlus();
			mobile.setPrice(300);
			} 
		else if(makemodel.equalsIgnoreCase("SpiceMono")) {
			mobile = new SpiceFire();
			mobile.setPrice(400);
		}
		return mobile;
	}
}
