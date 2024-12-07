package tr.com.ornek;

public class Cikar extends HesapBase implements Hesap {
    public Cikar(double sayi) {
        super(sayi);
    }

    public double hesapla(double oncekiSayi) {
        return oncekiSayi - getSayi();
    }

}
