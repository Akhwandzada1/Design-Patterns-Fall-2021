package AbstractFactoryHomeWork;

public class CatFactory implements SpecieFactory {

	@Override
	public Mammal createMammal() {
		// TODO Auto-generated method stub
		return new Cat();
	}

	@Override
	public Reptile createReptile() {
		// TODO Auto-generated method stub
		return null;
	}

}
