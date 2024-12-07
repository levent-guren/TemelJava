package futbol;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

import lombok.ToString;

@ToString(exclude = "listeners")
public class Top {
	private int x;
	private int y;
	private List<PropertyChangeListener> listeners = new ArrayList<>();

	public void addListener(PropertyChangeListener listener) {
		listeners.add(listener);
	}

	public void removeObservable(PropertyChangeListener listener) {
		listeners.remove(listener);
	}

	public void setX(int x) {
		notifyAllListeners("x", this.x, x);
		this.x = x;
	}

	public void setY(int y) {
		notifyAllListeners("y", this.y, y);
		this.y = y;
	}

	public void notifyAllListeners(String propertyName, Object oldValue, Object newValue) {
		listeners.forEach(listener -> {
			PropertyChangeEvent event = new PropertyChangeEvent(this, propertyName, oldValue,
					newValue);
			listener.propertyChange(event);
		});
	}
}
