package tr.com.ornek3;

public class Sayac extends Thread {
    private static int sayi = 0;

    public static int getSayi() {
        return sayi;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized ("") {
                int s = sayi;
                bekle(10);
                sayi = s + 1;
            }
        }
    }

    public static void bekle(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
        }
    }
}
