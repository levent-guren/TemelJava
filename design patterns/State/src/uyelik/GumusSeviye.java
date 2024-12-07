package uyelik;

import lombok.ToString;

@ToString
public class GumusSeviye implements Seviye {

	@Override
	public void seviyeHesapla(Uye uye) {
		int satisMiktari = uye.getAylikSatis();
		if (satisMiktari > 10000) {
			uye.setSeviye(new AltinSeviye());
		} else if (satisMiktari < 3000) {
			uye.setSeviye(new BronzSeviye());
		}
	}
}
