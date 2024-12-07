package kutuphane;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Kitap {
	public static enum KitapTurleri {
		ROMAN, HIKAYE, POLISIYE
	}

	private KitapTurleri tur;
	private String adi;
	private String yazari;
}
