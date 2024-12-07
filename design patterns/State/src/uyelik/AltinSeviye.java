package uyelik;

import lombok.ToString;

@ToString
public class AltinSeviye implements Seviye {

	@Override
	public void seviyeHesapla(Uye uye) {
		int satisMiktari = uye.getAylikSatis();
		if (satisMiktari < 11000) {
			if (satisMiktari < 4000) {
				uye.setSeviye(new BronzSeviye());
			} else {
				uye.setSeviye(new GumusSeviye());
			}
		}
	}

}
