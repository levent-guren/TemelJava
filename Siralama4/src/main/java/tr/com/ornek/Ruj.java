package tr.com.ornek;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Ruj implements Comparable<Ruj>{
    private int fiyat;

    @Override
    public int compareTo(Ruj o) {
        return -1*Integer.valueOf(fiyat).compareTo(o.fiyat);
    }
}
