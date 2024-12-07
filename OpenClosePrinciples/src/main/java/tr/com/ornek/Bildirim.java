package tr.com.ornek;

public class Bildirim {
    public void bildirimGonder(String bilgi, BildirimTipi tip) {
        switch (tip) {
            case SMS -> {
                smsGonder(bilgi);
                break;
            }
            case EMAIL -> {
                emailGonder(bilgi);
                break;
            }
            case WHATSAPP -> {
                whatsAppGonder(bilgi);
                break;
            }
        }
    }

    private void whatsAppGonder(String bilgi) {
        System.out.println("WhatsApp mesajı gönderiliyor: " + bilgi);
    }

    private void emailGonder(String bilgi) {
        System.out.println("Email mesajı gönderiliyor: " + bilgi);
    }

    private void smsGonder(String bilgi) {
        System.out.println("SMS mesajı gönderiliyor: " + bilgi);
    }
}
