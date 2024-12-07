package havalimani;

import lombok.Getter;

public abstract class Ucak {
	@Getter
	private String ucusNo;
	private Kule kule;

	public Ucak(String ucusNo) {
		this.ucusNo = ucusNo;
	}

	public void kuleyeBaglan(Kule kule) {
		kule.ucakBaglandi(this);
		this.kule = kule;
	}

	public void kuledenAyril() {
		kule.ucakAyrildi(this);
		this.kule = null;
	}

	public void mesajGonder(String mesaj) {
		kule.mesajGonder(this.ucusNo, mesaj);
	}

	public void mesajGonder(String ucusNo, String mesaj) {
		kule.mesajGonder(this.ucusNo, ucusNo, mesaj);
	}

	public abstract void mesajAl(String gonderenUcakUcusNo, String kimeGonderiliyorUcusNo,
			String mesaj);
}
