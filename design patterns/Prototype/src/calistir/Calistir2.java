package calistir;

import beans.Bilgisayar;
import beans.Harddisk;

public class Calistir2 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Bilgisayar bilgisayar = new Bilgisayar("Asus", new Harddisk("Seagate", 5200));
		Bilgisayar bilgisayar2 = (Bilgisayar) bilgisayar.clone();
		System.out.println("Bilgisayar  :" + bilgisayar);
		System.out.println("Bilgisayar 2:" + bilgisayar2);
		System.out.println("-------------");

		bilgisayar.setMarka("HP");
		bilgisayar.getHdd().setRpm(7200);
		System.out.println("Bilgisayar  :" + bilgisayar);
		System.out.println("Bilgisayar 2:" + bilgisayar2);
	}
}
