package tr.com.ornek;

public class Main {
    public static void main(String[] args) {
        // dependancy inversion, sınıf tipinde referans saklamak yerine
        // abstract tipinde referans saklamak gerektiğini söylüyor.
        // Biz de HesapMakinesi'nde Hesap tipinde bir liste sakladık.
        HesapMakinesi hesapMakinesi = new HesapMakinesi(1.0);
//        hesapMakinesi.islemEkle(new Topla(4.0));
//        hesapMakinesi.islemEkle(new Topla(2.5));
//        hesapMakinesi.islemEkle(new Carp(2.0));
//        hesapMakinesi.islemEkle(new Cikar(1.0));
//        hesapMakinesi.islemEkle(new Bol(2.0));
//        hesapMakinesi.islemEkle(new Us(2.0));

        hesapMakinesi
                .islemEkle(new Topla(4.0))
                .islemEkle(new Topla(2.5))
                .islemEkle(new Carp(2.0))
                .islemEkle(new Cikar(1.0))
                .islemEkle(new Bol(2.0))
                .islemEkle(new Us(2.0));

        System.out.println(hesapMakinesi.hesapla());
    }
}