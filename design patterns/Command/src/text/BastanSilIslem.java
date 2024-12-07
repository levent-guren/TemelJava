package text;

public class BastanSilIslem extends Islem {

	public BastanSilIslem(String metin, TextEditor editor) {
		super(metin, editor);
	}

	@Override
	public void geriAl() {
		getEditor().getText().insert(0, getMetin());
	}

}
