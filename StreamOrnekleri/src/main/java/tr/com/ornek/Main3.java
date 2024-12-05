package tr.com.ornek;

import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Main3 {
    public static void main(String[] args) {
        List<Kisi> kisiler = Arrays.asList(
                new Kisi("Ahmet", Cinsiyet.ERKEK, 23),
                new Kisi("Mehmet", Cinsiyet.ERKEK, 64),
                new Kisi("Ayşe", Cinsiyet.KADIN, 44),
                new Kisi("Şeyma", Cinsiyet.KADIN, 18),
                new Kisi("Ömer", Cinsiyet.ERKEK, 45),
                new Kisi("Itır", Cinsiyet.KADIN, 32),
                new Kisi("Zeynep", Cinsiyet.KADIN, 22),
                new Kisi("İsmail", Cinsiyet.ERKEK, 73),
                new Kisi("Ümran", Cinsiyet.KADIN, 57)
        );
        Collator collator =  Collator.getInstance(Locale.forLanguageTag("TR"));
        //kisiler.stream().sorted(Comparator.comparing(Kisi::getAdi))
        //        .forEach(System.out::println); // Türkçeye göre sıralamıyor
        kisiler.stream().sorted((k1, k2) -> collator.compare(k1.getAdi(), k2.getAdi()))
            .forEach(System.out::println); // Türkçe harf sırasına göre sıralıyor

    }
}
