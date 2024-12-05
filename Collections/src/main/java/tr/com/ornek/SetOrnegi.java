package tr.com.ornek;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetOrnegi {
    public static void main(String[] args) {
        Set<Integer> sayilar = new HashSet<>();
        sayilar.add(5); // autoboxing
        sayilar.add(8);
        sayilar.add(2);
        sayilar.add(1);
        sayilar.add(4);
        sayilar.add(6);
        sayilar.add(9);
        Iterator<Integer> itr =  sayilar.iterator();
        while(itr.hasNext()) {
            int sayi = itr.next();
            System.out.println(sayi);
        }
        Set<String> isimler = new HashSet<>();
        isimler.add("ali");
        isimler.add("veli");
        isimler.add("baha");
        isimler.add("zeynep");
        isimler.add("ali"); // kümeye aynı değerden ikincisi konamıyor. Tek olarak saklıyor.
        Iterator<String> itr2 =  isimler.iterator();
        while(itr2.hasNext()) {
            String isim = itr2.next();
            System.out.println(isim);
        }
    }
}
