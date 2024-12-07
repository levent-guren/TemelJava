package beans;

import lombok.Data;

@Data
public class Personel implements Cloneable {
	private int sicil;
	private String adi;
	private String soyadi;

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
