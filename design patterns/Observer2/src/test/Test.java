package test;

import futbol.Oyuncu;
import futbol.Top;

public class Test {
	public static void main(String[] args) {
		Top top = new Top();
		Top top2 = new Top();

		Oyuncu oyuncu1 = new Oyuncu("Gokhan");
		Oyuncu oyuncu2 = new Oyuncu("Tarik");
		Oyuncu oyuncu3 = new Oyuncu("Melih");
		Oyuncu oyuncu4 = new Oyuncu("Emin");
		Oyuncu oyuncu5 = new Oyuncu("Riza");

		top.addListener(oyuncu1);
		top.addListener(oyuncu2);
		top.addListener(oyuncu3);

		top2.addListener(oyuncu2);
		top2.addListener(oyuncu5);
		top2.addListener(oyuncu4);

		top.setX(50);
		top.setY(30);

		top2.setX(10);
		top2.setY(60);
	}
}
