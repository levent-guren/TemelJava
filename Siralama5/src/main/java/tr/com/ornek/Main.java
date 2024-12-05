package tr.com.ornek;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Etek[] etekler = {
                new Etek("Mango", 190),
                new Etek("Zara", 110),
                new Etek("LCW", 220)};

        Arrays.sort(etekler, new Comparator<Etek>() {
            @Override
            public int compare(Etek e1, Etek e2) {
                return  e1.getMarka().compareTo(e2.getMarka());
            }
        });

        for(int i = 0; i < etekler.length; i++) {
            System.out.println(etekler[i]);
        }

        Ruj[] rujlar = { new Ruj(30), new Ruj(300), new Ruj(200), new Ruj(220) };
        Arrays.sort(rujlar, (r1, r2) -> Integer.valueOf(r1.getFiyat()).compareTo(r2.getFiyat()));
        for(int i = 0; i < rujlar.length; i++) {
            System.out.println(rujlar[i]);
        }

    }

}