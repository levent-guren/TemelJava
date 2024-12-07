package calistir;

import beans.Personel;

public class Calistir {
	public static void main(String[] args) {
		Personel personel = new Personel();
		personel.setAdi("Levent");
		personel.setSoyadi("GÜREN");
		personel.setSicil(123);
		System.out.println(personel);
		Personel personel2;
		try {
			personel2 = (Personel) personel.clone();
			// personel2 = personel;
			personel2.setAdi("Mahmut");
			System.out.println("Personel2: " + personel2);
			System.out.println("Personel: " + personel);
			if (personel == personel2) {
				System.out.println("clone obje referansı aynıdır");
			} else {
				System.out.println("clone obje referansı farklıdır");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
