package beans;

import lombok.Data;

// product
@Data
public class MacWindow implements IWindow {
	private String title;

	@Override
	public String getType() {
		return "Mac Window";
	}

}
