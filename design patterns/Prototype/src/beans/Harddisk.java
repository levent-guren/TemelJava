package beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Harddisk implements Cloneable {
	private String marka;
	private int rpm;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
