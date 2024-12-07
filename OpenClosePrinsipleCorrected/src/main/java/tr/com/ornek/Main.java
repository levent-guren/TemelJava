package tr.com.ornek;

public class Main {
    public static void main(String[] args) {
        Bildirim bildirim = new Bildirim(new SMSGonder());
        bildirim.bildirimGonder("Hoşgeldiniz");
        Bildirim bildirim2 = new Bildirim(new EmailGonder());
        //bildirim.setBildirimGonderen(new EmailGonder());
        bildirim2.bildirimGonder("Hoşgeldiniz");
    }
}