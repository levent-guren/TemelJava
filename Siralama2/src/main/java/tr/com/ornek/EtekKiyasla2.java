package tr.com.ornek;

public class EtekKiyasla2 implements  Kiyasla{
    @Override
    public int kiyasla(Object o1, Object o2) {
        Etek e1 = (Etek) o1;
        Etek e2 = (Etek) o2;
        int sonuc = 0;
        if (e1.getFiyat() > e2.getFiyat()) {
            sonuc = -1;
        } else if (e1.getFiyat() < e2.getFiyat()) {
            sonuc = 1;
        }
        return sonuc;
    }
}
