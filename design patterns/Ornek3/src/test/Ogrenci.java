package test;

public class Ogrenci extends Object {
	private String adi;

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	@Override
	public String toString() {
		return "Ogrenci adi=" + adi;
	}
}
