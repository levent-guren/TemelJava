package test;

import kutuphane.Kitap;
import kutuphane.Kitap.KitapTurleri;
import kutuphane.Kutuphane;
import kutuphane.Kutuphaneci;

public class Test {
	public static void main(String[] args) {
		Kutuphaneci kutuphaneci = new Kutuphaneci(new Kutuphane());
		kutuphaneci.kitapVer(new Kitap(KitapTurleri.HIKAYE, "Harem", "Omer Seyfettin"));
		kutuphaneci.kitapVer(new Kitap(KitapTurleri.ROMAN, "Sefiller", "V.Hugo"));
		kutuphaneci.kitapVer(new Kitap(KitapTurleri.HIKAYE, "Yuksek Okceler", "Omer Seyfettin"));
		kutuphaneci.kitapVer(new Kitap(KitapTurleri.HIKAYE, "Bir Ocak Sondu", "Kemalettin Tugcu"));
		kutuphaneci.kitapVer(new Kitap(KitapTurleri.POLISIYE, "Behzat C.", "Anonim"));

		System.out.println(kutuphaneci.kitapAl("Sefiller", KitapTurleri.ROMAN));
		System.out.println(kutuphaneci.kitapAl("Yuksek Okceler", KitapTurleri.POLISIYE));
		System.out.println(kutuphaneci.kitapAl("Sefiller", KitapTurleri.ROMAN));
	}
}
