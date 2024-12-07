package tr.com.ornek3;

public class WhatsAppGonder implements IBildirim {
    @Override
    public void bildirimGonder(String bilgi) {
        System.out.println("WhatsApp gonderiliyor: "+bilgi);
    }
}
