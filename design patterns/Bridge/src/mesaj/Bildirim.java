package mesaj;

import beans.Musteri;

public abstract class Bildirim {
	private Musteri musteri;

	public Bildirim(Musteri musteri) {
		this.musteri = musteri;
	}

	protected Musteri getMusteri() {
		return musteri;
	}

	public abstract void bildirimYap();
}
