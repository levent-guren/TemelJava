package test;

import text.TextEditor;

public class Test {
	public static void main(String[] args) {
		TextEditor editor = new TextEditor();
		editor.basaEkle("hava ");
		editor.sonaEkle("çok ");
		editor.basaEkle("Bugun ");
		editor.sonaEkle("guzel");
		editor.sondanSil(2);
		editor.bastanSil(1);
		editor.sonaEkle(".");
		editor.basaEkle("----");
		editor.sondanSil(2);
		editor.islemleriGeriAl(5);
		editor.basaEkle("!!!!");
		editor.islemleriGeriAl(1);
		System.out.println(editor);
		editor.islemleriGeriAl(100);
		System.out.println(editor);
	}
}
