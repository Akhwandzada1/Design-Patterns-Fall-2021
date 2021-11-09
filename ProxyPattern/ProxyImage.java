package ProxyPattern;

public class ProxyImage implements Image {
	
	private String filename;
	private RealImage realImage;
	public ProxyImage(String filename) {
		this.filename=filename;
	}
	
	public String getFileName() {
		return filename;
	}
	@Override
	public void display() {
		if(realImage==null)
			realImage=new RealImage(filename);
		realImage.display();
		
	}

}
