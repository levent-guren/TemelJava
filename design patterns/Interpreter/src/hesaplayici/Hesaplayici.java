package hesaplayici;

import yorumlayici.IsaretYorumlayici;
import yorumlayici.SayiYorumlayici;

public class Hesaplayici {
	public int hesapla(String ifade, boolean adimlariYazdir) {
		IsaretYorumlayici isaretYorumlayici = new IsaretYorumlayici();
		SayiYorumlayici sayiYorumlayici = new SayiYorumlayici();
		isaretYorumlayici.yorumla(ifade);
		sayiYorumlayici.yorumla(ifade);
		while (isaretYorumlayici.isaretKaldiMi()) {
			if (adimlariYazdir) {
				System.out.print(sayiYorumlayici.getSayilar() + " ");
				System.out.println(isaretYorumlayici.getIsaretler());
			}
			String sonIsaret = isaretYorumlayici.getSonIsaret();
			Integer sayi1 = sayiYorumlayici.getSonSayi();
			Integer sayi2 = sayiYorumlayici.getSonSayi();
			Integer sonuc = hesapla(sayi1, sayi2, sonIsaret);
			sayiYorumlayici.sonaEkle(sonuc);
		}
		return sayiYorumlayici.getSonSayi();
	}

	private Integer hesapla(Integer sayi2, Integer sayi1, String sonIsaret) {
		if (sonIsaret.equals("+")) {
			return sayi1 + sayi2;
		} else if (sonIsaret.equals("-")) {
			return sayi1 - sayi2;
		} else if (sonIsaret.equals("*")) {
			return sayi1 * sayi2;
		} else if (sonIsaret.equals("/")) {
			return sayi1 / sayi2;
		}
		return 0;
	}
}
