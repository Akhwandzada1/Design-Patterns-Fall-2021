package LabAssignment02Q02FactoryPattern;

public class LondonMobileFactory extends MobileFactory{

	@Override
	public SpiceMobile constructMobile(String makemodel){
		SpiceMobile mobile = null;
		if(makemodel.equalsIgnoreCase("SpiceFire")){
			mobile = new SpicePlus();
			mobile.setPrice(140);
			}
		else if(makemodel.equalsIgnoreCase("SpiceBolt")){
			mobile = new SpiceBolt();
			mobile.setPrice(200);
			}

		return mobile;
	}
}
