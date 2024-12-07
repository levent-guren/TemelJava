package beans;

import lombok.Data;

@Data
public class Muteahhit {
	private EvBuilder builder;

	public Ev insaEt(boolean boyali, boolean esyali) {
		Ev ev = new Ev();
		builder.setEv(ev);

		builder.zeminHazirla();
		builder.duvarHazirla();
		builder.catiHazirla();

		ev.setBoya(boyali);
		ev.setEsya(esyali);

		return ev;
	}
}
