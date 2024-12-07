package test;

import pizza.InceHamurPizza;
import pizza.KalinHamurPizza;
import pizza.PeynirliPizza;
import pizza.Pizza;
import pizza.SucukluPizza;
import pizza.ZeytinliPizza;

public class Test {
	public static void main(String[] args) {
		Pizza pizza = new PeynirliPizza(new InceHamurPizza(new Pizza()));
		System.out.println(pizza);

		Pizza pizza2 = new KalinHamurPizza(
				new SucukluPizza(new PeynirliPizza(new ZeytinliPizza(new Pizza()))));
		System.out.println(pizza2);

	}
}
