package okul;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mudur implements Personel {
	private String adi;

	@Override
	public void accept(Visitor visitor) {
		if (visitor instanceof Mufettis) {
			// Mufettis Mudur'u denetleyemez
			return;
		}
		visitor.visit(this);
	}
}
