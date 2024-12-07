package text;

public class SondanSilIslem extends Islem {

	public SondanSilIslem(String metin, TextEditor editor) {
		super(metin, editor);
	}

	@Override
	public void geriAl() {
		getEditor().getText().append(getMetin());
	}

}
