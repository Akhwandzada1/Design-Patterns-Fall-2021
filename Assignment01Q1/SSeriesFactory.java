package Assignment01Q1;

public class SSeriesFactory implements SamsungMobileFactory {

	@Override
	public Sseries createSSeries() {
		// TODO Auto-generated method stub
		return new S21Ultra();
	}
	@Override
	public NoteSeries createNoteSeries() {
		// TODO Auto-generated method stub
		return null;
	}
}
