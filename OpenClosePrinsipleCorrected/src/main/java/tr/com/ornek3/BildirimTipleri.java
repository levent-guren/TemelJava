package tr.com.ornek3;

public enum BildirimTipleri {
    SMS, EMAIL, WHATSAPP;

    private IBildirim bildirimGonderici;

    public IBildirim getBildirimGonderici() {
        return bildirimGonderici;
    }

    private BildirimTipleri() {
        if (name().equals("SMS")) {
            bildirimGonderici = new SMSGonder();
        } else if (name().equals("EMAIL")) {
            bildirimGonderici = new EmailGonder();
        }
    }
}
