package yorumlayici;

import java.util.ArrayList;
import java.util.List;

public class SayiYorumlayici implements Yorumlayici {
	private List<Integer> sayilar = new ArrayList<>();

	public List<Integer> getSayilar() {
		return sayilar;
	}

	@Override
	public void yorumla(String ifade) {
		String[] parcalar = ifade.split(" ");
		for (String parca : parcalar) {
			try {
				Integer sayi = Integer.parseInt(parca);
				sayilar.add(sayi);
			} catch (NumberFormatException ex) {
				// bakilan ifade sayi degil.
			}
		}
	}

	public Integer getSonSayi() {
		Integer sonSayi = sayilar.get(sayilar.size() - 1);
		sayilar.remove(sayilar.size() - 1);
		return sonSayi;
	}

	public void sonaEkle(Integer sonuc) {
		sayilar.add(sonuc);
	}

}
