package AbstractFactoryHomeWork;

public class TrynnosaurusFactory implements SpecieFactory {
	@Override
	public Mammal createMammal() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Reptile createReptile() {
		// TODO Auto-generated method stub
		return new Trynnosaurus();
	}
}
