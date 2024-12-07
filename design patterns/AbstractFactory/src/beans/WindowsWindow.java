package beans;

import lombok.Data;

//product
@Data
public class WindowsWindow implements IWindow {
	private String title;

	@Override
	public String getType() {
		return "Windows Window";
	}

}
