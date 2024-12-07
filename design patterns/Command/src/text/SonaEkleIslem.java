package text;

public class SonaEkleIslem extends Islem {

	public SonaEkleIslem(String metin, TextEditor editor) {
		super(metin, editor);
	}

	@Override
	public void geriAl() {
		getEditor().getText().delete(getEditor().getText().length() - getMetin().length(),
				getEditor().getText().length());
	}

}
