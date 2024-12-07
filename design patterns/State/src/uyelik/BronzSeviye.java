package uyelik;

import lombok.ToString;

@ToString
public class BronzSeviye implements Seviye {

	@Override
	public void seviyeHesapla(Uye uye) {
		int satisMiktari = uye.getAylikSatis();
		if (satisMiktari > 2000) {
			if (satisMiktari < 7000) {
				// Gumus
				uye.setSeviye(new GumusSeviye());
			} else {
				// Altin
				uye.setSeviye(new AltinSeviye());
			}
		}
	}

}
