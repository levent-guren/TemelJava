package tr.com.ornek;

import jdk.jfr.Timespan;

public class Main2 {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Başladı");
        deneme();
        System.out.println("Bitti");
    }
    private static void deneme() throws InterruptedException {
        // runtime exception'larda ilgili hiç kod yazmazsak metod sonuna
        // throws yazılmış varsayılıyor.
        Thread.sleep(1000);
    }
}
