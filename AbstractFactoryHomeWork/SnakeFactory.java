package AbstractFactoryHomeWork;

public class SnakeFactory implements SpecieFactory {

	@Override
	public Mammal createMammal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reptile createReptile() {
		// TODO Auto-generated method stub
		return new Snake();
	}
}
