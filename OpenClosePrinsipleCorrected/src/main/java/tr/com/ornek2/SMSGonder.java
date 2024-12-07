package tr.com.ornek2;

public class SMSGonder implements IBildirim {
    @Override
    public void bildirimGonder(String bilgi) {
        System.out.println("SMS gonderiliyor: "+bilgi);
    }
}
