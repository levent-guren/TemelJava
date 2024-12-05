package tr.com.ornek;

public class RujKiyasla implements  Kiyasla{
    @Override
    public int kiyasla(Object o1, Object o2) {
        Ruj r1 = (Ruj) o1;
        Ruj r2 = (Ruj) o2;
        int sonuc = 0;
        if (r1.getFiyat() > r2.getFiyat()) {
            sonuc = 1;
        } else if (r1.getFiyat() < r2.getFiyat()) {
            sonuc = -1;
        }
        return sonuc;
    }
}
