package tr.com.ornek;

public class Bol extends HesapBase implements Hesap {
    public Bol(double sayi) {
        super(sayi);
    }

    public double hesapla(double oncekiSayi) {
        return oncekiSayi / getSayi();
    }

}
