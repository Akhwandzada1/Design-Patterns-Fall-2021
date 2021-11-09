package LabAssignment02Q01PrototypePattern;

public class CakeStore {
	public CakeStore() {
		
	}
	public static void main(String args[]) {
		CheeseCake cake = new CheeseCake();
		cake.addSugar("100g");
		cake.addButter("200g");
		cake.addCheese("Acapella");
		//cake.setName("Fruit Cake");
		System.out.println("Cake = " + cake.toString());

		
		CheeseCake cake1 = (CheeseCake) cake.prepareCake();
		cake1.setName("Bastien");
		System.out.println("Cake1 = " + cake1.toString());


		CheeseCake cake2 = (CheeseCake) cake.prepareCake();
		cake2.addCheese("Extra Cheese");
		cake2.setName("Adams");
		System.out.println("Cake3 = " + cake2.toString());
	}
}
