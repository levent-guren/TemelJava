package futbol;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Top {
	private int x;
	private int y;
	private List<Observable> observables = new ArrayList<>();

	public void addObservable(Observable observable) {
		observables.add(observable);
	}

	public void removeObservable(Observable observable) {
		observables.remove(observable);
	}

	public void setX(int x) {
		this.x = x;
		notifyAllObservables();
	}

	public void setY(int y) {
		this.y = y;
		notifyAllObservables();
	}

	public void notifyAllObservables() {
		observables.forEach(o -> o.topYerDegistirdi(this));
	}
}
