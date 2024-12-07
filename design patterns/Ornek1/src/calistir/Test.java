package calistir;

import arac.Araba;
import arac.Audi;

public class Test {
	public static void main(String[] args) {
		Audi audi = new Audi();
		// referans değişken tipimiz Audi ise bu tipteki değişkene ulaşılır.
		audi.hiz = 50;
		Araba araba = audi;
		// Burada ise Araba sınıfından gelen değişkene referans ediyoruz.
		araba.hiz = 80;
		// Yine aynı mantık ile Audi ve Araba sınıflarından gelen değişken değerlerini
		// okuyoruz.
		System.out.println(audi.hiz);
		System.out.println(araba.hiz);

		// metodlarda ise durum farklı. Eğer alt sınıfta (Audi) aynı isimde metod
		// yazılıp üst sınıftaki metod ezilmiş ise her zaman ezen (Audi sınıfındaki)
		// metod çalıştırılır. Referans değişken tipi etkilemez.
		System.out.println(audi.getHiz());
		System.out.println(araba.getHiz());

	}
}
