package pizza;

import lombok.Data;

// UML diyagramındaki Builder tipi
@Data
public abstract class PizzaBuilder {
	private Pizza pizza;

	public abstract void hamuruHazirla();

	public abstract void icindekileriEkle();

	public abstract void pisir();
}
