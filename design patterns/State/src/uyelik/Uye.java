package uyelik;

import lombok.Data;

@Data
public class Uye {
	private Seviye seviye = new BronzSeviye();
	private int aylikSatis;

	public void setAylikSatis(int aylikSatis) {
		this.aylikSatis = aylikSatis;
		seviye.seviyeHesapla(this);
	}

	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("Uye(seviye=");
		str.append(seviye);
		str.append(", aylikSatis=");
		str.append(aylikSatis);
		str.append(")");
		return str.toString();
	}
}
