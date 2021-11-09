package ChainOfResponsibilityHomeWork;

public class DocFileHandler extends BaseHandler {
	String name;

	public DocFileHandler(String name) {
		super(name);
		this.name=name;
	}

	@Override
	public void handle(File file) {
		if(file.getType()==FileType.DOC) {
			System.out.println("Process and saving file... by MS Word");
		}
		else if(nextHandler!=null) {
			System.out.println("MS Word forwards request to Adobe Acrobat");
			nextHandler.handle(file);		}
		
	}

}
