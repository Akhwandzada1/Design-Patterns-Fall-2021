package LabAssignment02Q02FactoryPattern;

public class Demo {
	public static void main(String args[]) {
		MobileFactory factory = new LondonMobileFactory();
		SpiceMobile mobile1 = factory.produceMobile("SpiceBolt");
		MobileFactory NYFactory = new NYMobileFactory();
		SpiceMobile mobile2 = factory.produceMobile("SpiceMono");
	}
}
