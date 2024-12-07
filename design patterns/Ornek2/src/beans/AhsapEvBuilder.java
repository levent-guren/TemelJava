package beans;

public class AhsapEvBuilder extends EvBuilder {

	@Override
	public void zeminHazirla() {
		getEv().setZemin("Ahşap Zemin");
	}

	@Override
	public void duvarHazirla() {
		getEv().setDuvar("Kereste Duvar");
	}

	@Override
	public void catiHazirla() {
		getEv().setCati("Kereste Çatı");
	}

}
