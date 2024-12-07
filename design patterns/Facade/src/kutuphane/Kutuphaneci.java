package kutuphane;

import java.util.Optional;

import kutuphane.Kitap.KitapTurleri;

public class Kutuphaneci {
	private Kutuphane kutuphane;

	public Kutuphaneci(Kutuphane kutuphane) {
		this.kutuphane = kutuphane;
	}

	public Kitap kitapAl(String kitapAdi, KitapTurleri kitapTur) {
		Kat kat = kutuphane.getKatlar().get(kitapTur);
		char kitapBasHarfi = kitapAdi.charAt(0);
		Raf raf = rafBul(kat, kitapBasHarfi);
		Optional<Kitap> bulunanKitap = raf.getKitaplar().stream()
				.filter(k -> k.getAdi().equals(kitapAdi)).findFirst();
		if (bulunanKitap.isPresent()) {
			raf.getKitaplar().remove(bulunanKitap.get());
		}
		return bulunanKitap.orElse(null);
	}

	public void kitapVer(Kitap kitap) {
		Kat kat = kutuphane.getKatlar().get(kitap.getTur());
		char kitapBasHarfi = kitap.getAdi().charAt(0);
		Raf raf = rafBul(kat, kitapBasHarfi);
		raf.getKitaplar().add(kitap);
	}

	private Raf rafBul(Kat kat, char kitapBasHarfi) {
		Raf raf = kat.getRaflar().get(kitapBasHarfi);
		if (raf == null) {
			raf = new Raf();
			kat.getRaflar().put(kitapBasHarfi, raf);
		}
		return raf;
	}
}
