package ChainOfResponsibilityHomeWork;

public class PDFFileHandler extends BaseHandler {
	String name;

	public PDFFileHandler(String name) {
		super(name);
		this.name=name;
	}

	@Override
	public void handle(File file) {
		if(file.getType()==FileType.PDF) {
			System.out.println("Processing and Saving pdf file... by Adobe Acrobat");
		}
		else if(nextHandler!=null) {
			System.out.println("Adobe Acrobat forwards request to VLC Player");
			nextHandler.handle(file);
		}
		
	}

}
