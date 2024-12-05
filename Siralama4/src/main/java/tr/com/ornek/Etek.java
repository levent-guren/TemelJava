package tr.com.ornek;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Etek implements  Comparable<Etek>{
    private String marka;
    private int fiyat;

    @Override
    public int compareTo(Etek o) {
        return -1*marka.compareTo(o.getMarka());
    }
}
