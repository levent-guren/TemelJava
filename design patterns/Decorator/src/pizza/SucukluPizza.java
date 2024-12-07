package pizza;

public class SucukluPizza extends Pizza {
	private Pizza pizza;

	public SucukluPizza(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getHamur() {
		return pizza.getHamur();
	}

	@Override
	public String getMalzemeler() {
		return pizza.getMalzemeler() + " sucuklu";
	}
}
