package uyelik;

import lombok.ToString;

@ToString
public class BronzSeviye implements Seviye {
	@Override
	public int primHesabi(Uye uye) {
		return (int) (uye.getAylikSatis() * 0.1);
	}

}
