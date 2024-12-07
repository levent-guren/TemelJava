package mesaj;

import beans.Musteri;

public class EPostaBildirim extends Bildirim {

	public EPostaBildirim(Musteri musteri) {
		super(musteri);
	}

	@Override
	public void bildirimYap() {
		System.out.println(getMusteri().getAdi() + " adlı müşteriye eposta bildirimi yapildi.");
	}

}
