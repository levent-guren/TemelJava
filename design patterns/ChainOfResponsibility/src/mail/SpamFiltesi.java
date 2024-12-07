package mail;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class SpamFiltesi {
	private Mail mail;
	private SpamFiltesi siradakiFiltre;

	protected abstract boolean spamKontrolu();

	public void setMail(Mail mail) {
		this.mail = mail;
		if (siradakiFiltre != null) {
			siradakiFiltre.setMail(mail);
		}
	}

	public boolean spamMi() {
		if (spamKontrolu()) {
			return true;
		}

		// mail'in spam olup olmadigina karar verilemedi.
		// Diger spam filtre siniflarina sorulmasi gerekiyor.
		if (getSiradakiFiltre() != null) {
			return getSiradakiFiltre().spamMi();
		}
		return false;
	};
}
