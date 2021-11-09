package AbstractFactory;

public class WindowsFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public CheckBox createcheckBox() {
		return new WindowsCheckBox();
	}
}
