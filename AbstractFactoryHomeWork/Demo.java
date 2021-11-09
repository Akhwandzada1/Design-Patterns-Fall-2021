package AbstractFactoryHomeWork;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpecieFactory factory;
		Mammal mammal;
		Reptile reptile;
		//configuration of factory
		factory=new DogFactory();
		mammal=factory.createMammal();
		mammal.makeSound();
	}

}
