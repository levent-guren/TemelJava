package kutuphane;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import kutuphane.Kitap.KitapTurleri;
import lombok.Data;

@Data
public class Kutuphane {
	private Map<KitapTurleri, Kat> katlar = new HashMap<>();

	public Kutuphane() {
		Arrays.asList(KitapTurleri.values()).forEach(tur -> {
			katlar.put(tur, new Kat());
		});
//		for (int i = 0; i < KitapTurleri.values().length; i++) {
//			katlar.put(KitapTurleri.values()[i], new Kat());
//		}
	}
}
