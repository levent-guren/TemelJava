public class Kitap {
    String adi;
    String yazar;
    int sayfaSayisi;

    Kitap(String adi) {
        this.adi = adi;
    }
    Kitap(String adi, int sayfaSayisi, String yazar) {
        this(adi);
        this.sayfaSayisi = sayfaSayisi;
        this.yazar = yazar;
    }

}
