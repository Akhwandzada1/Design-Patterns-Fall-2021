package ChainOfResponsibilityHomeWork;

public abstract class BaseHandler implements Handler {
	String name;
	Handler nextHandler;
	public BaseHandler(String name) {
		this.name=name;
	}
	@Override
	public void setNext(Handler handler) {
		this.nextHandler=handler;
	}
	@Override
	public String getName() {
		return name;
	}
	

}
