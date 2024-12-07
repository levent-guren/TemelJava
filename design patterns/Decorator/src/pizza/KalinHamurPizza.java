package pizza;

public class KalinHamurPizza extends Pizza {
	private Pizza pizza;

	public KalinHamurPizza(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getHamur() {
		return "Kalin";
	}

	@Override
	public String getMalzemeler() {
		return pizza.getMalzemeler();
	}
}
