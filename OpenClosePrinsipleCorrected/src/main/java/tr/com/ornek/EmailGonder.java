package tr.com.ornek;

public class EmailGonder implements IBildirim {
    @Override
    public void bildirimGonder(String bilgi) {
        System.out.println("Email gonderiliyor: "+bilgi);
    }
}
