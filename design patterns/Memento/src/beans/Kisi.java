package beans;

import lombok.Data;

@Data
public class Kisi {
	private int id;
	private String adi;
	private String soyadi;
	private int yas;

	public KisiMemento getMemento() {
		return new KisiMemento(this);
	}

	public void mementoyaDon(KisiMemento memento) {
		memento.geriDon(this);
	}
}
