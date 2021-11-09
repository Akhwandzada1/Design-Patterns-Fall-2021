package AbstractFactoryHomeWork;

public class DogFactory implements SpecieFactory {

	@Override
	public Mammal createMammal() {
		// TODO Auto-generated method stub
		return new Dog();
	}

	@Override
	public Reptile createReptile() {
		// TODO Auto-generated method stub
		return null;
	}

}
