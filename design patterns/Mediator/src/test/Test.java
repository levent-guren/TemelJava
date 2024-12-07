package test;

import havalimani.Boeing;
import havalimani.Kule;
import havalimani.SavasanSahin;

public class Test {
	public static void main(String[] args) {
		Boeing boeing1 = new Boeing("TRK-8345-LA-54");
		Boeing boeing2 = new Boeing("TK-723");
		SavasanSahin savasanSahin1 = new SavasanSahin("J-4");
		SavasanSahin savasanSahin2 = new SavasanSahin("J-26");

		Kule kule = new Kule();
		boeing1.kuleyeBaglan(kule);
		boeing2.kuleyeBaglan(kule);
		savasanSahin1.kuleyeBaglan(kule);
		savasanSahin2.kuleyeBaglan(kule);

		boeing1.mesajGonder("Herkese Merhaba!!!");
		boeing2.mesajGonder("J-26", "Inise geciyorum. Lutfen onumden cekilin.");

		savasanSahin2.kuledenAyril();
		boeing2.mesajGonder("Herkese iyi gunler.");

	}
}
