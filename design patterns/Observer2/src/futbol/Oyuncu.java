package futbol;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Oyuncu implements PropertyChangeListener {
	private String adi;

	public Oyuncu(String adi) {
		this.adi = adi;
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		System.out.print(adi + " adli futbolcu topun yer degistirdigini anladi.");
		System.out.println(evt.getPropertyName() + " degisti. Eski degeri:" + evt.getOldValue()
				+ ", Yeni degeri:" + evt.getNewValue() + " Topun son hali:" + evt.getSource());
	}

}
