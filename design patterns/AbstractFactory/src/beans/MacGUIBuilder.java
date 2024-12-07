package beans;

// ConcreteFactory
public class MacGUIBuilder implements GUIFactory {

	@Override
	public IButton createButton() {
		return new MacButton();
	}

	@Override
	public IWindow createWindow() {
		return new MacWindow();
	}

}
