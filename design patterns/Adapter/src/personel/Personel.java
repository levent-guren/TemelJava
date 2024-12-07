package personel;

import lombok.ToString;

@ToString
public class Personel {
	private Integer sicil;
	private String adi;
	private String soyadi;

	public static enum PersonelDegisken {
		SICIL, ADI, SOYADI;
	}

	public void degerAta(PersonelDegisken degisken, Object deger) {
		switch (degisken) {
		case SICIL: {
			sicil = (Integer) deger;
			break;
		}
		case ADI: {
			adi = (String) deger;
			break;
		}
		case SOYADI: {
			soyadi = (String) deger;
			break;
		}
		}
	}

	public Object getDeger(PersonelDegisken degisken) {
		switch (degisken) {
		case SICIL: {
			return sicil;
		}
		case ADI: {
			return adi;
		}
		case SOYADI: {
			return soyadi;
		}
		}
		return null;
	}
}
