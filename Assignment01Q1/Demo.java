package Assignment01Q1;

public class Demo {

	public static void main(String[] args) {
		SamsungMobileFactory factory;
		Sseries sseries;
		NoteSeries noteseries;
		
		factory=new SSeriesFactory();
		sseries=factory.createSSeries();
		factory=new NoteSeriesFactory();
		noteseries=factory.createNoteSeries();
	}

}
