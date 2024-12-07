package pizza;

public class KasarliMantarliPizzaBuilder extends PizzaBuilder {

	@Override
	public void hamuruHazirla() {
		// ince hamurlu olsun.
	}

	@Override
	public void setPizza(Pizza pizza) {
		super.setPizza(pizza);
		pizza.setAdi("Kaşarlı Mantarlı İnce hamur Pizza");
	}

	@Override
	public void icindekileriEkle() {
		getPizza().getIcindekiler().add("Kaşar");
		getPizza().getIcindekiler().add("Mantar");
	}

	@Override
	public void pisir() {
		getPizza().setPisirmeSuresi(15);
	}

}
