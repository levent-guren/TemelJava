package beans;

// Abstract Factory
public interface GUIFactory {
	public IButton createButton();

	public IWindow createWindow();
}
