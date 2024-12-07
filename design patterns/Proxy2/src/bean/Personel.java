package bean;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Personel implements IPersonel {
	private int sicil;
	private String adi;
	private BigDecimal maas;
}
