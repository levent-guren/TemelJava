package mail;

public class SpamFiltresi2 extends SpamFiltesi {

	@Override
	protected boolean spamKontrolu() {
		if (getMail().getGonderen().contains("@hotmail")) {
			// gonderen kisminda hotmail geciyorsa mail spam olarak kabul edilir
			return true;
		}
		return false;
	}

}
