package ChainOfResponsibilityHomeWork;

public interface Handler {
	public void setNext(Handler handler);
	public void handle(File file);
	public String getName();
}
