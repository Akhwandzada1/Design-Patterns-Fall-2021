package AbstractFactory;

public class Application {
	private Button button;
	private CheckBox checkBox;
	
	public Application(GUIFactory factory) {
		button=factory.createButton();
		checkBox=factory.createcheckBox();
	}
	public void paint() {
		button.paint();
		checkBox.draw();
	}
}
