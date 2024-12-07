package tr.com.ornek;

public class Topla extends HesapBase implements Hesap {
    public Topla(double sayi) {
        super(sayi);
    }

    @Override
    public double hesapla(double oncekiSayi) {
        return oncekiSayi + getSayi();
    }
}
