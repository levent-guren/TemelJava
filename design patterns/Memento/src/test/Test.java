package test;

import beans.Kisi;
import beans.KisiMemento;

public class Test {
	public static void main(String[] args) {
		// kisi sinifinin veri tabanindan okundugunu dusunelim.
		Kisi kisi = new Kisi();
		kisi.setId(12);
		kisi.setAdi("Mutlu");
		kisi.setSoyadi("Uzun");
		kisi.setYas(28);

		System.out.println("Veritabanindan okunan hali: ");
		System.out.println(kisi);
		System.out.println();

		// eski hali degistirilmeden once saklaniyor.
		System.out.println("Kisi sinifinin su anki hali memento1 olarak saklaniyor.");
		KisiMemento memento = kisi.getMemento();

		// kisi sinifi ekran tarafindan degistiriliyor.
		kisi.setId(23);
		kisi.setAdi("Tanyeli");
		kisi.setSoyadi("Toprak");
		kisi.setYas(13);

		System.out.println("Ekran tarafindan degistirilmis hali:");
		System.out.println(kisi);
		System.out.println();

		System.out.println("Kisi sinifinin su anki hali memento2 olarak saklaniyor.");
		KisiMemento memento2 = kisi.getMemento();

		System.out.println("Kisi sinifi memento1 haline donduruluyor.");
		kisi.mementoyaDon(memento);
		System.out.println("Eski haline donmus kisi:");
		System.out.println(kisi);
		System.out.println();

		System.out.println("Kisi sinifi memento2 haline donduruluyor.");
		kisi.mementoyaDon(memento2);
		System.out.println("Tekrar yeni haline donmus kisi:");
		System.out.println(kisi);
		System.out.println();

		System.out.println(
				"Kisi sinifinin son hali memento1'den farkli mi? (Kaydedilmis halinden sonra degisiklik yapilmis mi?)");
		System.out.println(memento.degisiklikVarMi(kisi));
		System.out.println();

		System.out.println("Kisi sinifinin son hali memento2'den farkli mi?");
		System.out.println(memento2.degisiklikVarMi(kisi));
	}
}
