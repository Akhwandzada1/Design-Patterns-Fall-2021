package ChainOfResponsibilityHomeWork;

public class TextFileHandler extends BaseHandler {
	String name;

	public TextFileHandler(String name) {
		super(name);
		this.name=name;
	}

	@Override
	public void handle(File file) {
		if(file.getType()==FileType.TXT) {
			System.out.println("Processing and saving txt file... by Notepad++");
		}
		else if(nextHandler != null){
			System.out.println("Notepad++ forwards the request to MS Word");
			nextHandler.handle(file);
			
		}
		
	}

}
