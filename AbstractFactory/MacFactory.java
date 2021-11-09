package AbstractFactory;

public class MacFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new MacButton();
	}
	@Override
	public CheckBox createcheckBox() {
		return new MacCheckBox();
	}
}
