package tr.com.ornek3;

public class SMSGonder implements IBildirim {
    @Override
    public void bildirimGonder(String bilgi) {
        System.out.println("SMS gonderiliyor: "+bilgi);
    }
}
