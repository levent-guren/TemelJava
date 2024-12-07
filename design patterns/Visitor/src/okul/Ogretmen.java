package okul;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ogretmen implements Personel {
	private String adi;

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
