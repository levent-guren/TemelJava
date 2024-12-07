package tr.com.ornek2;

public class EmailGonder implements IBildirim {
    @Override
    public void bildirimGonder(String bilgi) {
        System.out.println("Email gonderiliyor: "+bilgi);
    }
}
