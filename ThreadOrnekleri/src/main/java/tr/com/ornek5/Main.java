package tr.com.ornek5;

public class Main {
    public static void main(String[] args) {
        Sayac s1 = new Sayac();
        Sayac s2 = new Sayac();
        // Sayac sınıfının Thread cınıfından türetilmesi çok fazla miktarda
        // bellek harcamaya neden oluyor. Bundan kurtulmak için Sayac sınıfını
        // Thread sınıfından türetmiyoruz. Runnable interface'i ile ilişkilendiriyoruz.
        // Thread oluşturup yazdığımız run metodunun çağırılmasını da aşağıdaki gibi
        // yapıyoruz.

        // new Thread(s1).start();
        // new Thread(s2).start();

        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s2);
        t1.start();
        t2.start();
        Sayac.bekle(500);
        System.out.println(Sayac.getSayi());
    }
}
