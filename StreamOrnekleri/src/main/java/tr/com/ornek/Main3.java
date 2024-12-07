package tr.com.ornek;

import java.text.Collator;
import java.util.*;
import java.util.stream.Collectors;

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
        //kisiler.stream().sorted(Comparator.comparing(Kisi::getAdi).reversed())
        //        .forEach(System.out::println); // Türkçeye göre sıralamıyor
        kisiler.stream().sorted((k1, k2) -> collator.compare(k1.getAdi(), k2.getAdi()))
            .forEach(System.out::println); // Türkçe harf sırasına göre sıralıyor
        boolean hepsi20denBuyuk = kisiler.stream().allMatch(kisi -> kisi.getYas() > 20);
        boolean herhangiBiri70tenBuyuk = kisiler.stream().anyMatch(kisi -> kisi.getYas() > 70);
        System.out.println("***************");
        kisiler.stream().max(Comparator.comparing(Kisi::getYas)).ifPresent(System.out::println);
        kisiler.stream().min(Comparator.comparing(Kisi::getAdi)).ifPresent(System.out::println);
        System.out.println("***************");
        Map<Cinsiyet, List<Kisi>> kisilerGroup = kisiler.stream().collect(Collectors.groupingBy(Kisi::getCinsiyet));
        // ctrl-alt-v seçili kodun döndürdüğü değeri bir uygun tipte değişkene atayan kodu yazar.
        kisilerGroup.forEach((cinsiyet, kisiListesi) -> {
            System.out.println(cinsiyet);
            kisiListesi.forEach(System.out::println);
        });
    }
}
