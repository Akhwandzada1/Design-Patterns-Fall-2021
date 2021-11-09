package ChainOfResponsibilityHomeWork;

public class File {
	String name;
	String path;
	FileType filetype;
	
	public File(String name, String path, FileType filetype){
		this.name=name;
		this.path=path;
		this.filetype=filetype;
		
	}
	public String getName() {
		return name;
	}
	public FileType getType() {
		return filetype;
	}
	public String getPath() {
		return path;
	}
}
