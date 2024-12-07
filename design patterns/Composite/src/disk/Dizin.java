package disk;

import java.util.ArrayList;
import java.util.List;

// @ToString(exclude = "altYapilar")
public class Dizin extends Yapi {
	private List<Yapi> altYapilar = new ArrayList<>();

	public Dizin(String adi) {
		super(adi, 0);
	}

	public void ekle(Yapi yapi) {
		altYapilar.add(yapi);
	}

	public void yazdir() {
		yazdir(0);
	}

	@Override
	protected void yazdir(int seviye) {
		super.yazdir(seviye);
		altYapilar.forEach(yapi -> yapi.yazdir(seviye + 1));
	}

	@Override
	public String toString() {
		return "[/" + getAdi() + "]";
	}

}
