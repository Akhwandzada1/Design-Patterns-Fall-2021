package LabAssignment01;

public class Demo {
 public static void main(String[] args) {
	 CarFactory factory1=new PakistanCarFactory();
	 CarFactory factory2=new EuropeCarFactory();
	 System.out.println(factory1.createMiniCar());
	 System.out.println(factory2.createMiniCar());
	 System.out.println(factory1.createLuxuryCar());
	 System.out.println(factory2.createLuxuryCar());
 }
}
