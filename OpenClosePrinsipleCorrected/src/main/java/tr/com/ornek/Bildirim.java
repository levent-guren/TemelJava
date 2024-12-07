package tr.com.ornek;

public class Bildirim {
    IBildirim bildirimGonderen;

    public Bildirim(IBildirim bildirimGonderen) {
        this.bildirimGonderen = bildirimGonderen;
    }

    public void setBildirimGonderen(IBildirim bildirimGonderen) {
        this.bildirimGonderen = bildirimGonderen;
    }

    public void bildirimGonder(String bilgi) {
        System.out.println("Bildirim gonderiliyor.");
        bildirimGonderen.bildirimGonder(bilgi);
    }
}
