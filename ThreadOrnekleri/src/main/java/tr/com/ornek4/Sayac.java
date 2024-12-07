package tr.com.ornek4;

public class Sayac extends Thread {
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
