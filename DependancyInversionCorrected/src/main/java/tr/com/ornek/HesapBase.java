package tr.com.ornek;

public abstract class HesapBase {
    private double sayi;

    public HesapBase(double sayi) {
        this.sayi = sayi;
    }

    public double getSayi() {
        return sayi;
    }

    public void setSayi(double sayi) {
        this.sayi = sayi;
    }
}
