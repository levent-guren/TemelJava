package tr.com.ornek;

public class Us extends HesapBase implements Hesap {
    public Us(double sayi) {
        super(sayi);
    }

    @Override
    public double hesapla(double oncekiSayi) {
        return Math.pow(oncekiSayi , getSayi());
    }
}
