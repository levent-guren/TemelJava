package mail;

public class SpamFiltresi3 extends SpamFiltesi {

	@Override
	protected boolean spamKontrolu() {
		if (getMail().getGonderen().equals(getMail().getAlici())) {
			// gonderen aliciya esit ise mail spam olarak kabul edilir
			return true;
		}
		return false;
	}

}
