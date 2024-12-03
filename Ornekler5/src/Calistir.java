public class Calistir {
    public static void main(String[] args) {
        Araba araba1 = new Araba();
        Araba araba2 = new Araba();
        araba1.hiz = 100;
        // static değişken/metodlara sınıf ismi ile erişilmelidir.
        Araba.marka = "BMW";

        araba2.hiz = 60;
        Araba.marka = "Seat Leon";

        System.out.println(araba1.hiz);
        System.out.println(Araba.marka);
        System.out.println(araba2.hiz);
        System.out.println(Araba.marka);
    }
}
