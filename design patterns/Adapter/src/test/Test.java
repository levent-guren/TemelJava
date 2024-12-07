package test;

import personel.Personel;
import personel.PersonelAdapter;

public class Test {
	public static void main(String[] args) {
		Personel personel = new Personel();
		personel.degerAta(Personel.PersonelDegisken.SICIL, 12);
		personel.degerAta(Personel.PersonelDegisken.ADI, "Abdulmuttalip");
		personel.degerAta(Personel.PersonelDegisken.SOYADI, "Uyur");

		System.out.println(personel);

		PersonelAdapter personelAdapter = new PersonelAdapter(new Personel());
		personelAdapter.setSicil(23);
		personelAdapter.setAdi("Makbule");
		personelAdapter.setSoyadi("Kavak");
		System.out.println(personelAdapter.getPersonel());
	}
}
