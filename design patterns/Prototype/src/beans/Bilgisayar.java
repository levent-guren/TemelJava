package beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bilgisayar implements Cloneable {
	private String marka;
	private Harddisk hdd;

	@Override
	public Object clone() throws CloneNotSupportedException {
		Bilgisayar clone = (Bilgisayar) super.clone();
		clone.setHdd((Harddisk) hdd.clone());
		return clone;
	}
}
