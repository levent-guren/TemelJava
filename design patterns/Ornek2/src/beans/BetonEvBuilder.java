package beans;

public class BetonEvBuilder extends EvBuilder {

	@Override
	public void zeminHazirla() {
		getEv().setZemin("Parke Zemin");
	}

	@Override
	public void duvarHazirla() {
		getEv().setDuvar("Perde Beton Duvar");
	}

	@Override
	public void catiHazirla() {
		getEv().setCati("Beton Çatı");
	}

}
