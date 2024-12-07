package pizza;

public class PeynirliPizza extends Pizza {
	private Pizza pizza;

	public PeynirliPizza(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getHamur() {
		return pizza.getHamur();
	}

	@Override
	public String getMalzemeler() {
		return pizza.getMalzemeler() + " peynirli";
	}
}
