package tr.com.ornek2;


public class Main {
    public static void main(String[] args) {
        Bildirim.bildirimGonder("Hoşgeldiniz", new SMSGonder());
        Bildirim.bildirimGonder("Hoşgeldiniz", new EmailGonder());
    }
}