package bean;

import java.math.BigDecimal;

public class PersonelProxy implements IPersonel {
	private Personel personel;

	public PersonelProxy(Personel personel) {
		this.personel = personel;
	}

	@Override
	public int getSicil() {
		return personel.getSicil();
	}

	@Override
	public void setSicil(int sicil) {
		personel.setSicil(sicil);
	}

	@Override
	public String getAdi() {
		return personel.getAdi();
	}

	@Override
	public void setAdi(String adi) {
		personel.setAdi(adi);
	}

	@Override
	public BigDecimal getMaas() {
		return personel.getMaas();
	}

	@Override
	public void setMaas(BigDecimal maas) {
		System.out.println(personel.getSicil() + " sicilli personelin maasi degistiriliyor");
		personel.setMaas(maas);
	}

	@Override
	public String toString() {
		return personel.toString();
	}

}
