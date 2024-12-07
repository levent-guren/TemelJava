package test;

import uyelik.AltinSeviye;
import uyelik.BronzSeviye;
import uyelik.GumusSeviye;
import uyelik.Uye;

public class Test {
	public static void main(String[] args) {
		Uye uye = new Uye();
		uye.setAylikSatis(5000);

		uye.setSeviye(new BronzSeviye());
		System.out.println(uye.primHesabi());

		uye.setSeviye(new GumusSeviye());
		System.out.println(uye.primHesabi());

		uye.setSeviye(new AltinSeviye());
		System.out.println(uye.primHesabi());
	}
}
