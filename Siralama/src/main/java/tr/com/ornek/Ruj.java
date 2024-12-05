package tr.com.ornek;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Ruj implements Kiyaslanabilir{
    private int fiyat;

    @Override
    public int kiyasla(Object obje) {
        Ruj ruj = (Ruj) obje;
        int sonuc = 0;
        if (ruj.getFiyat() > getFiyat()) {
            sonuc = 1;
        } else  if (ruj.getFiyat() < getFiyat()) {
            sonuc = -1;
        }
        return sonuc;
    }
}
