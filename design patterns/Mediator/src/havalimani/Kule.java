package havalimani;

import java.util.ArrayList;
import java.util.List;

public class Kule {
	private List<Ucak> ucaklar = new ArrayList<>();

	public void mesajGonder(String gonderenUcakUcusNo, String mesaj) {
//		ucaklar.stream().filter(ucak -> !ucak.getUcusNo().equals(gonderenUcakUcusNo))
//				.forEach(ucak -> ucak.mesajAl(gonderenUcakUcusNo, null, mesaj));
		for (Ucak ucak : ucaklar) {
			if (!ucak.getUcusNo().equals(gonderenUcakUcusNo)) {
				// mesaji kendisine gondermeyecegiz
				ucak.mesajAl(gonderenUcakUcusNo, null, mesaj);
			}
		}
	}

	public void mesajGonder(String gonderenUcakUcusNo, String ucusNo, String mesaj) {
//		ucaklar.stream().filter(ucak -> ucak.getUcusNo().equals(ucusNo))
//				.forEach(ucak -> ucak.mesajAl(gonderenUcakUcusNo, ucusNo, mesaj));
		for (Ucak ucak : ucaklar) {
			if (ucak.getUcusNo().equals(ucusNo)) {
				ucak.mesajAl(gonderenUcakUcusNo, ucusNo, mesaj);
			}
		}
	}

	public void ucakBaglandi(Ucak ucak) {
		ucaklar.add(ucak);
		System.out.println(ucak.getUcusNo() + " nolu ucak kuleye baglandi");
	}

	public void ucakAyrildi(Ucak ucak) {
		ucaklar.remove(ucak);
		System.out.println(ucak.getUcusNo() + " nolu ucak kuleden ayrildi");
	}

}
