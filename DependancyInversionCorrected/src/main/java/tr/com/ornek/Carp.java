package tr.com.ornek;

public class Carp extends HesapBase implements Hesap {
    public Carp(double sayi) {
        super(sayi);
    }

    @Override
    public double hesapla(double oncekiSayi) {
        return oncekiSayi * getSayi();
    }

}
