package arac;

public class Audi extends Araba {
    // değişkenlere referans tipi ile erişim istenmiyor.
    // Bu yüzden tüm değişkenleri private olarak yazıyoruz.
    // Gereken değişkenlere de get, set fonksiyonları yazıyoruz.

    int hiz;

    public int getHiz() {
        return hiz;
    }
}
