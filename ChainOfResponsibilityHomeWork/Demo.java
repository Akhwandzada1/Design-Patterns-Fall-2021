package ChainOfResponsibilityHomeWork;

public class Demo {

	public static void main(String[] args) {
		Handler textHandler=new TextFileHandler("Notepad++");
		Handler docHandler=new DocFileHandler("MS Word");
		Handler pdfHandler=new PDFFileHandler("Adobe Acrobat");
		Handler mp3Handler=new MP3FileHandler("VLC Media Player");
		textHandler.setNext(docHandler);
		docHandler.setNext(pdfHandler);
		pdfHandler.setNext(mp3Handler);
		File file=null;
		file=new File("Abc.doc", "C:",FileType.DOC);
		textHandler.handle(file);
		System.out.println("-------------------------------------");
		file=new File("Def.pdf","C:",FileType.PDF);
		textHandler.handle(file);
		System.out.println("-------------------------------------");
		file=new File("Ghi.txt","C:",FileType.TXT);
		textHandler.handle(file);
		System.out.println("--------------------------------------");
		file=new File("JK1.mp3","C:",FileType.MP3);
		textHandler.handle(file);
		System.out.println("--------------------------------------");
		file=new File("Mno.gif","C:",FileType.GIF);
		textHandler.handle(file);
		
		
	}

}
