package test;

import okul.Mufettis;
import okul.Okul;
import okul.SaglikMemuru;

public class Test {
	public static void main(String[] args) {
		Okul okul = new Okul();

		Mufettis mufettis = new Mufettis();
		SaglikMemuru saglikMemuru = new SaglikMemuru();

		okul.visit(mufettis);
		okul.visit(saglikMemuru);
	}
}
