package tr.com.ornek;

import java.util.ArrayList;
import java.util.List;

public class HesapMakinesi {
    private double ilkDeger;

    public HesapMakinesi(double ilkDeger) {
        this.ilkDeger = ilkDeger;
    }

    private List<Hesap> islemler = new ArrayList<>();

    public HesapMakinesi islemEkle(Hesap islem) {
        islemler.add(islem);
        return this;
    }

    public double hesapla() {
        double sonuc = ilkDeger;
        for (Hesap hesap : islemler) {
            sonuc = hesap.hesapla(sonuc);
        }
        return sonuc;
    }
}
