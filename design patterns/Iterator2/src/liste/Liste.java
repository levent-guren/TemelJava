package liste;

import java.util.ArrayList;
import java.util.List;

public class Liste<T> {
	List<T> liste = new ArrayList<>();

	public void ekle(T obj) {
		liste.add(obj);
	}

	public Ilerletici<T> ilerleticiVer() {
		return new Ilerletici<T>(liste);
	}
}
