package AdapterPattern;

public class RoundPegg implements RoundPeg{
	private double radius;

	@Override
	public void RoundPeg(double radius) {
		this.radius=radius;
		
	}

	@Override
	public double getRadius() {
		return radius;
	}
	
}
