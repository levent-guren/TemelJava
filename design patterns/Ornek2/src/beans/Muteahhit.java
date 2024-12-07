package beans;

import lombok.Data;

@Data
public class Muteahhit {
	private EvBuilder builder;

	public Ev insaEt() {
		Ev ev = new Ev();
		builder.setEv(ev);

		builder.zeminHazirla();
		builder.duvarHazirla();
		builder.catiHazirla();

		return ev;
	}
}
