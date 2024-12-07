package text;

public class BasaEkleIslem extends Islem {

	public BasaEkleIslem(String metin, TextEditor editor) {
		super(metin, editor);
	}

	@Override
	public void geriAl() {
		getEditor().getText().delete(0, getMetin().length());
	}

}
