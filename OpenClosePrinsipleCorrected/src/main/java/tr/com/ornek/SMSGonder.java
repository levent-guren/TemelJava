package tr.com.ornek;

public class SMSGonder implements IBildirim {
    @Override
    public void bildirimGonder(String bilgi) {
        System.out.println("SMS gonderiliyor: "+bilgi);
    }
}
