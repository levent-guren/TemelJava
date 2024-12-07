package tr.com.ornek3;

public class Bildirim {
   public static void bildirimGonder(String bilgi, BildirimTipleri tip) {
        System.out.println("Bildirim gonderiliyor.");
        tip.getBildirimGonderici().bildirimGonder(bilgi);
    }
}
