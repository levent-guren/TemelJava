package test;

import disk.Dizin;
import disk.Dosya;

public class Test {
	public static void main(String[] args) {
		Dizin kokDizin = getKokDizin();
		kokDizin.yazdir();
	}

	private static Dizin getKokDizin() {
		Dizin root = new Dizin("");
		Dosya pageFile = new Dosya("pagefile.sys", 15976276);
		Dosya hibernateFile = new Dosya("hibernate.sys", 32764328783L);
		root.ekle(pageFile);
		root.ekle(hibernateFile);

		Dizin temp = new Dizin("temp");
		Dosya dosya1 = new Dosya("gecici1.txt", 237467);
		Dosya dosya2 = new Dosya("gecici2.doc", 2763547);
		temp.ekle(dosya1);
		temp.ekle(dosya2);

		root.ekle(temp);

		Dizin windows = new Dizin("windows");
		Dosya dosya3 = new Dosya("win.ini", 92);
		Dosya dosya4 = new Dosya("winhlp32.exe", 11776);
		windows.ekle(dosya3);
		windows.ekle(dosya4);

		root.ekle(windows);
		return root;
	}
}
