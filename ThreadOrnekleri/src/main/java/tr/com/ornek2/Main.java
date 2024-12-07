package tr.com.ornek2;

public class Main {
    public static void main(String[] args) {
        Sayac s1 = new Sayac();
        Sayac s2 = new Sayac();
        s1.start();
        s2.start();
        Sayac.bekle(500);
        System.out.println(Sayac.getSayi());
    }
}
