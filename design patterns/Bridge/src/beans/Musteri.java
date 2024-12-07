package beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Musteri {
	private String adi;
	private MusteriBildirimTercihi bildirimTercihi;

	public static enum MusteriBildirimTercihi {
		SMS, MAIL, WHATSAPP
	}
}
