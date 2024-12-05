package tr.com.ornek;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Etek implements Kiyaslanabilir {
    private String marka;
    private int fiyat;

    @Override
    public int kiyasla(Object obje) {
        Etek etek = (Etek) obje;
        int sonuc = 0;
        if (etek.getFiyat() > getFiyat()) {
            sonuc = 1;
        } else  if (etek.getFiyat() < getFiyat()) {
            sonuc = -1;
        }
        return sonuc;
    }
}
