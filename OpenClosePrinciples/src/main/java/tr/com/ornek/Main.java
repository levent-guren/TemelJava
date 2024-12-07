package tr.com.ornek;

public class Main {
    // Yeni bir bildirim tipi eklendiğinde ya da çıkarıldığında
    // projenin kodlarının değişmemesi isteniyor. Bu projede Bildirim
    // sınıfının değişmesi gerekiyor.
    public static void main(String[] args) {
        Bildirim bildirim = new Bildirim();
        bildirim.bildirimGonder("Hoşgeldiniz", BildirimTipi.SMS);
    }
}