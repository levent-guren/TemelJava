package text;

import java.util.ArrayList;
import java.util.List;

public class TextEditor {
	private StringBuilder text = new StringBuilder();
	private List<Islem> islemler = new ArrayList<>();

	public StringBuilder getText() {
		return text;
	}

	public void basaEkle(String yazi) {
		text.insert(0, yazi);
		islemler.add(new BasaEkleIslem(yazi, this));
	}

	public void sonaEkle(String yazi) {
		text.append(yazi);
		islemler.add(new SonaEkleIslem(yazi, this));
	}

	public void bastanSil(int miktar) {
		String silinenYazi = text.substring(0, miktar);
		islemler.add(new BastanSilIslem(silinenYazi, this));
		text.delete(0, miktar);
	}

	public void sondanSil(int miktar) {
		String silinenYazi = text.substring(text.length() - miktar, text.length());
		islemler.add(new SondanSilIslem(silinenYazi, this));
		text.delete(text.length() - miktar, text.length());
	}

	public void islemleriGeriAl(int islemMiktari) {
		while (islemMiktari > 0 && islemler.size() > 0) {
			islemMiktari--;
			Islem sonIslem = islemler.get(islemler.size() - 1);
			sonIslem.geriAl();
			islemler.remove(sonIslem);
		}
	}

	@Override
	public String toString() {
		return text.toString();
	}
}
