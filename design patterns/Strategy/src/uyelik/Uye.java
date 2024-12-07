package uyelik;

import lombok.Data;

@Data
public class Uye {
	private Seviye seviye = new BronzSeviye();
	private int aylikSatis;

	public int primHesabi() {
		return seviye.primHesabi(this);
	}

	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("Uye(seviye=");
		str.append(seviye);
		str.append(")");
		return str.toString();
	}
}
