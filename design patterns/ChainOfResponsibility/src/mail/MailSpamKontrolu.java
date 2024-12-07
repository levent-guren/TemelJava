package mail;

public class MailSpamKontrolu {
	private SpamFiltesi[] filtreler = { new SpamFiltresi1(), new SpamFiltresi2(),
			new SpamFiltresi3() };

	public MailSpamKontrolu() {
		for (int i = 0; i < filtreler.length - 1; i++) {
			// son filtre haric her filtrenin siradaki filtre bilgisi atanir
			filtreler[i].setSiradakiFiltre(filtreler[i + 1]);
		}
	}

	public void setMail(Mail mail) {
		filtreler[0].setMail(mail);
	}

	public boolean spamKontrolu() {
		return filtreler[0].spamMi();
	}
}
