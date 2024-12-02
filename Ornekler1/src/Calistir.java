public class Calistir {
    public static void main(String[] args) {
        Personel a = null;
        a = new Personel();
        System.out.println(a.yas);
        a.yas = 32;
        Personel b = new Personel();
        b.yas = 26;
        System.out.println(a.yas);
        System.out.println(b.yas);
    }
}
