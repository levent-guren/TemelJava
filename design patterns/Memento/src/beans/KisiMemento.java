package beans;

import lombok.Data;

@Data
public class KisiMemento {
	private int id;
	private String adi;
	private String soyadi;
	private int yas;

	public KisiMemento(Kisi kisi) {
		id = kisi.getId();
		adi = kisi.getAdi();
		soyadi = kisi.getSoyadi();
		yas = kisi.getYas();
	}

	public boolean degisiklikVarMi(Kisi kisi) {
		return id != kisi.getId() || !adi.equals(kisi.getAdi())
				|| !soyadi.equals(kisi.getSoyadi()) && yas != kisi.getYas();
	}

	public void geriDon(Kisi kisi) {
		kisi.setId(id);
		kisi.setAdi(adi);
		kisi.setSoyadi(soyadi);
		kisi.setYas(yas);
	}
}
