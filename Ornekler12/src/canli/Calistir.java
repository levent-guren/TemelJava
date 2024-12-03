package canli;

public class Calistir {
    public static void main(String[] args) {
        Kopek kopek = new Kopek();
        kopek.yas = 4;
        Hayvan hayvan = kopek;
        hayvan.yas = 2;
        System.out.println(kopek.yas);
        System.out.println(hayvan.yas);
        System.out.println(((Hayvan)kopek).yas);
    }
}
