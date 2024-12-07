package okul;

public class Mufettis implements Visitor {

	@Override
	public void visit(Personel personel) {
		System.out.println("Mufettis " + personel.getAdi() + " adli personeli denetliyor.");
	}

}
