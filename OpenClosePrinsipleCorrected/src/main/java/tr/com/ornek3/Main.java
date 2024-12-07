package tr.com.ornek3;

// Bu örnek Open/Close prensibi için yazılmadı.
// BildirimTipi'nin veritabanı gibi bir yerden okunduğunu varsaydığımızda
// yazdığımız çözüm.
public class Main {
    public static void main(String[] args) {
        Bildirim.bildirimGonder("merhaba", BildirimTipleri.SMS);
    }
}