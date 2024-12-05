package tr.com.ornek;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> isimler = List.of("ali", "veli", "zeynep", "betül"); // değiştirilemez liste oluşturur.
        List<String> isimler2 = Arrays.asList("ali", "veli");
//        isimler.stream().forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
//        isimler.stream().forEach(
//            (String s) -> {
//                System.out.println(s);
//            }
//        );

//        isimler.stream().forEach(
//                (s) -> System.out.println(s)
//        );

        //isimler.forEach(System.out::println); // sadece forEach metodu için stream() demeden çağırmak mümkün
        isimler.forEach(Main::yazdir); // sadece fonksiyon referansı yazıldığında gelen değeri o fonksiyona parametre gönderir
    }
    public static void yazdir(String isim) {
        System.out.println(isim);
    }
}