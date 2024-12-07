package tr.com.ornek2;

public class Bildirim {
   public static void bildirimGonder(String bilgi, IBildirim bildirimGonderen) {
        System.out.println("Bildirim gonderiliyor.");
        bildirimGonderen.bildirimGonder(bilgi);
    }
}
