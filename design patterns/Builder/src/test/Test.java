package test;

import pizza.KasarliMantarliPizzaBuilder;
import pizza.PastirmaliPizzaBuilder;
import pizza.Pizza;
import pizza.Pizzaci;

public class Test {

	public static void main(String[] args) {
		Pizzaci pizzaci = new Pizzaci();
		pizzaci.setPizzaBuilder(new KasarliMantarliPizzaBuilder());
		Pizza pizza = pizzaci.pizzaHazirla();
		System.out.println(pizza);

		pizzaci.setPizzaBuilder(new PastirmaliPizzaBuilder());
		System.out.println(pizzaci.pizzaHazirla());

	}

}
