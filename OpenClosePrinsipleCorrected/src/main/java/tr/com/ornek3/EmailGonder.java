package tr.com.ornek3;

public class EmailGonder implements IBildirim {
    @Override
    public void bildirimGonder(String bilgi) {
        System.out.println("Email gonderiliyor: "+bilgi);
    }
}
