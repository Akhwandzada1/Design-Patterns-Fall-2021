package Assignment01Q1;

public class NoteSeriesFactory implements SamsungMobileFactory {

	@Override
	public Sseries createSSeries() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public NoteSeries createNoteSeries() {
		// TODO Auto-generated method stub
		return new Note20Ultra();
	}
}
