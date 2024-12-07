package test;

public class Test {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();
		str.append("Merhaba ");
		str.append("Dünya");
		str.append("!!!!");
		System.out.println(str.toString());

		Ogrenci ogrenci = new Ogrenci();
		ogrenci.setAdi("Mahmut");
		System.out.println(ogrenci);
	}
}
