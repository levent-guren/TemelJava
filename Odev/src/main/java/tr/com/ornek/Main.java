package tr.com.ornek;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();

        try (Scanner scanner = new Scanner(System.in)) {
            int sayi;
            do {
                System.out.println("Bir sayi giriniz. (Bitirmek için 0 giriniz) :");
                sayi = scanner.nextInt();
                if (sayi != 0) {
                    sayilar.add(sayi);
                }
            } while (sayi != 0);
            // kullanıcıdan sayılar istendi.
            int toplam = 0;
            for(int i = 0;i<sayilar.size();i++) {
                toplam += sayilar.get(i);
            }

            double ort = toplam / (double) sayilar.size();
            toplam = 0;
            for (Integer s : sayilar) {
                double fark = s - ort;
                toplam += (fark * fark);
            }
            double sonuc  = toplam / (double) (sayilar.size() -1);
            sonuc = Math.sqrt(sonuc);
            System.out.println(sonuc);
        }
        //scanner.close();

    }
}