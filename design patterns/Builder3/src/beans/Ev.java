package beans;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Ev {
	private String zemin;
	private String duvar;
	private String cati;
	private boolean boya;
	private boolean esya;
}
