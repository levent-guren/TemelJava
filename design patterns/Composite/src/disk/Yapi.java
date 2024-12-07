package disk;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Yapi {
	private String adi;
	private long boyut;

	protected void yazdir(int seviye) {
		for (int i = 0; i < seviye * 2; i++) {
			System.out.print(' ');
		}
		System.out.println(toString());
	}
}
