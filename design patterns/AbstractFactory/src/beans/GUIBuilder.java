package beans;

public class GUIBuilder {
	public GUIFactory createGUIBuilder(String system) {
		if (system.equals("MAC")) {
			return new MacGUIBuilder();
		} else if (system.equals("WINDOWS")) {
			return new WindowGUIBuilder();
		}
		return null;
	}
}
