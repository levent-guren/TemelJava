package arac;

public class Calistir {
    public static void main(String[] args) {
        Audi audi = new Audi();
        Araba araba = audi;
        audi.hiz = 85;
        araba.hiz = 30;
        System.out.println(audi.hiz);
        System.out.println(araba.hiz);
        System.out.println(audi.getHiz());
        System.out.println(araba.getHiz());
    }
}
