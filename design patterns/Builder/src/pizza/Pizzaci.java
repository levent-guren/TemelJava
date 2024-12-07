package pizza;

import lombok.Data;

//UML diyagramındaki Director tipi
@Data
public class Pizzaci {
	private PizzaBuilder pizzaBuilder;

	public Pizza pizzaHazirla() {
		Pizza pizza = new Pizza();
		pizzaBuilder.setPizza(pizza);

		pizzaBuilder.hamuruHazirla();
		pizzaBuilder.icindekileriEkle();
		pizzaBuilder.pisir();

		return pizza;
	}
}
