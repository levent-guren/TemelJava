package test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		Set<Integer> sayilar = new HashSet<>();
		sayilar.add(2);
		sayilar.add(1);
		sayilar.add(4);
		sayilar.add(3);
		sayilar.add(6);
		sayilar.add(5);
		Iterator<Integer> itr = sayilar.iterator();
		while (itr.hasNext()) {
			Integer sayi = (Integer) itr.next();
			System.out.println(sayi);
		}

		Set<String> isimler = new HashSet<>();
		isimler.add("ali");
		isimler.add("veli");
		isimler.add("musa");
		isimler.add("zeynep");
		isimler.add("kamuran");
		isimler.add("levent");
		Iterator<String> itr2 = isimler.iterator();
		while (itr2.hasNext()) {
			String str = (String) itr2.next();
			System.out.println(str);
		}
	}
}
