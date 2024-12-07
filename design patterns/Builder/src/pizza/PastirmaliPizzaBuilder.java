package pizza;

public class PastirmaliPizzaBuilder extends PizzaBuilder {

	@Override
	public void hamuruHazirla() {
		// kalın hamurlu olsun.
	}

	@Override
	public void setPizza(Pizza pizza) {
		super.setPizza(pizza);
		pizza.setAdi("Pastırmali kalın hamur pizza");
	}

	@Override
	public void icindekileriEkle() {
		getPizza().getIcindekiler().add("Pastırma");
		getPizza().getIcindekiler().add("Ceviz");
	}

	@Override
	public void pisir() {
		getPizza().setPisirmeSuresi(12);
	}

}
