package ChainOfResponsibilityHomeWork;

public class MP3FileHandler extends BaseHandler {
	String name;

	public MP3FileHandler(String name) {
		super(name);
		this.name=name;
	}

	@Override
	public void handle(File file) {
		if(file.getType()==FileType.MP3) {
			System.out.println("Processing and saving MP3 file... by VLC Media Player");
			
		}
		else if(nextHandler==null){
			System.out.println("File Type not supported");
		}
	}
}
