package hesap;

import java.util.HashMap;
import java.util.Map;

public class ProxyHesapMakinesi implements IHesapMakinesi {
	private HesapMakinesi hesapMakinesi;
	private Map<String, Double> sonuclar = new HashMap<>();

	public ProxyHesapMakinesi(HesapMakinesi hesapMakinesi) {
		this.hesapMakinesi = hesapMakinesi;
	}

	@Override
	public double hesapla(double sayi1, double sayi2, char islem) {
		String key = sayi1 + String.valueOf(islem) + sayi2;
		Double cevap = sonuclar.get(key);
		if (cevap == null) {
			cevap = hesapMakinesi.hesapla(sayi1, sayi2, islem);
			sonuclar.put(key, cevap);
		}
		return cevap;
	}

}
