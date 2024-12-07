package personel;

import personel.Personel.PersonelDegisken;

public class PersonelAdapter {
	private Personel personel;

	public PersonelAdapter(Personel personel) {
		this.personel = personel;
	}

	public Personel getPersonel() {
		return personel;
	}

	public String getAdi() {
		return (String) personel.getDeger(PersonelDegisken.ADI);
	}

	public String getSoyadi() {
		return (String) personel.getDeger(PersonelDegisken.SOYADI);
	}

	public Integer getSicil() {
		return (Integer) personel.getDeger(PersonelDegisken.SICIL);
	}

	public void setAdi(String adi) {
		personel.degerAta(PersonelDegisken.ADI, adi);
	}

	public void setSoyadi(String soyadi) {
		personel.degerAta(PersonelDegisken.SOYADI, soyadi);
	}

	public void setSicil(Integer sicil) {
		personel.degerAta(PersonelDegisken.SICIL, sicil);
	}
}
