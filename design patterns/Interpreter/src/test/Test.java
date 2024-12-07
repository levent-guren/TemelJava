package test;

import hesaplayici.Hesaplayici;

public class Test {
	public static void main(String[] args) {
		Hesaplayici hesaplayici = new Hesaplayici();
//		2 3 1 5 2 + * + -
//
//		5-2=3    2 3 1 3 + * + 
//		3+1=4    2 3 4 + * 
//		4*3=12   2 12 +
//		2+12=14  14
		System.out.println(hesaplayici.hesapla("2 3 1 5 2 + * + -", true));

		System.out.println(hesaplayici.hesapla("1 4 2 5 3 7 14 + - - + * +", false));

		System.out.println(hesaplayici.hesapla("2 3 5 + *", false));

	}
}
