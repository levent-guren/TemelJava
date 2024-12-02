public class Calistir  {
    public static void main(String[] args) {
        Anne anne = new Anne();
        Cocuk cocuk1 = new Cocuk();
        Cocuk cocuk2 = new Cocuk();
        anne.yas = 33;
        cocuk1.yas = 8;
        cocuk2.yas = 11;
        cocuk1.anne = anne;
        anne.cocuk = cocuk2;
        cocuk2.anne = anne;
        System.out.println(cocuk1.anne.cocuk.yas);

    }
}
