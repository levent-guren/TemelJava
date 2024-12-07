package mail;

public class SpamFiltresi1 extends SpamFiltesi {

	@Override
	protected boolean spamKontrolu() {
		// mail'in basligi tamamen buyuk harf ile yazilmissa mail spam olarak kabul
		// edilir
		String baslik = getMail().getBaslik();
		if (baslik == baslik.toUpperCase()) {
			// mail'in spam olduguna karar verildi
			return true;
		}
		return false;
	}

}
