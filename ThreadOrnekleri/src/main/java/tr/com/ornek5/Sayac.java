package tr.com.ornek5;

public class Sayac implements Runnable {
    private static int sayi = 0;

    public static int getSayi() {
        return sayi;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            ekle();
        }
    }

    public static void bekle(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
        }
    }
    private static synchronized void ekle() {
        int s = sayi;
        bekle(10);
        sayi = s + 1;
    }
}
