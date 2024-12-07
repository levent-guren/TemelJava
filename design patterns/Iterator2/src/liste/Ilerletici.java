package liste;

import java.util.List;

public class Ilerletici<T> {
	List<T> objeler;
	private int sira;

	public Ilerletici(List<T> objeler) {
		this.objeler = objeler;
		sira = 0;
	}

	public boolean objeKaldiMi() {
		return sira < objeler.size();
	}

	public T siradakiObje() {
		return objeler.get(sira++);
	}
}
