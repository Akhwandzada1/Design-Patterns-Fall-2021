package AdapterPattern;

public class SquarePegAdapter extends RoundPegg {
	
	private SquarePeg peg;
	
	public SquarePegAdapter(SquarePeg peg) {
		this.peg=peg;
	}
	
	@Override
	public double getRadius() {
		double result;
		result=Math.sqrt(Math.pow(peg.getWidth()/2, 2));
		return result;
	}

}
