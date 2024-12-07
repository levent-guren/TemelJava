package test;

import hesap.HesapMakinesi;
import hesap.IHesapMakinesi;
import hesap.ProxyHesapMakinesi;

public class Test {
	public static void main(String[] args) {
		IHesapMakinesi hm = new ProxyHesapMakinesi(new HesapMakinesi());
		System.out.println("1+2=" + hm.hesapla(1.0, 2.0, '+'));
		System.out.println("2*2=" + hm.hesapla(2.0, 2.0, '*'));
		System.out.println("3+5=" + hm.hesapla(3.0, 5.0, '+'));
		System.out.println("10-2=" + hm.hesapla(10.0, 2.0, '-'));
		System.out.println("1+2=" + hm.hesapla(1.0, 2.0, '+'));
		System.out.println("3+5=" + hm.hesapla(3.0, 5.0, '+'));
		System.out.println("2*2=" + hm.hesapla(2.0, 2.0, '*'));
		System.out.println("10/3=" + hm.hesapla(10.0, 3.0, '/'));
	}
}
