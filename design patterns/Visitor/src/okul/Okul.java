package okul;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Okul {
	private List<Personel> personeller = new ArrayList<>();

	public Okul() {
		personeller.add(new Ogretmen("Kazim"));
		personeller.add(new Ogretmen("Levent"));
		personeller.add(new Ogretmen("Veli"));
		personeller.add(new Ogretmen("Zeynep"));
		personeller.add(new Mudur("Ali Riza"));
	}

	public void visit(Visitor visitor) {
		personeller.forEach(p -> p.accept(visitor));
	}
}
