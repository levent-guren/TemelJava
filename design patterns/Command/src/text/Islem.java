package text;

import lombok.ToString;

@ToString
public abstract class Islem {
	public static enum IslemTipi {
		BASA_EKLE, SONA_EKLE, BASTAN_SIL, SONDAN_SIL
	}

	private String metin;
	private TextEditor editor;

	public Islem(String metin, TextEditor editor) {
		this.metin = metin;
		this.editor = editor;
	}

	protected TextEditor getEditor() {
		return editor;
	}

	protected String getMetin() {
		return metin;
	}

	public abstract void geriAl();
}
