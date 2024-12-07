package uyelik;

import lombok.ToString;

@ToString
public class AltinSeviye implements Seviye {
	@Override
	public int primHesabi(Uye uye) {
		return (int) (uye.getAylikSatis() * 0.45);
	}

}
