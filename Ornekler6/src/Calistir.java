public class Calistir {
    public static void main(String[] args) {
        int s = 4;
        int sonuc = topla(s, 5);
        System.out.println(sonuc);
        hesapla(s);
        System.out.println(s);
    }

    static int topla(int sayi1, int sayi2) {
        return sayi1+sayi2;
    }
    static void hesapla(int sayi) {
        System.out.println(sayi);
        sayi = 5;
    }

}
