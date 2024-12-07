package beans;

//ConcreteFactory
public class WindowGUIBuilder implements GUIFactory {

	@Override
	public IButton createButton() {
		return new WindowsButton();
	}

	@Override
	public IWindow createWindow() {
		return new WindowsWindow();
	}

}
