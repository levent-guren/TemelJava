package pizza;

public class InceHamurPizza extends Pizza {
	private Pizza pizza;

	public InceHamurPizza(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getHamur() {
		return "Ince";
	}

	@Override
	public String getMalzemeler() {
		return pizza.getMalzemeler();
	}
}
