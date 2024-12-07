package kutuphane;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Raf {
	private List<Kitap> kitaplar = new ArrayList<>();
}
