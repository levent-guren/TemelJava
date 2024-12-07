package okul;

public class SaglikMemuru implements Visitor {

	@Override
	public void visit(Personel personel) {
		if (personel instanceof Mudur) {
			System.out
					.println("Saglik memuru okul mudurune(" + personel.getAdi() + ") asi yapiyor.");
		} else {
			System.out
					.println("Saglik memuru " + personel.getAdi() + " adli personele asi yapiyor.");
		}
	}

}