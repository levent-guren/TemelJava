public class Calistir {
    public static void main(String[] args) {
        String adi = "Murteza";
        test(adi);
        System.out.println(adi);
        Kopek kopek = new Kopek();
        kopek.adi = "Karabaş";
        test(kopek);
        System.out.println(kopek.adi);
        test((String) null);
    }
    static void test(String adi) {
        adi = "Kamuran";
    }
    static void test(Kopek kopek) {
        kopek.adi = "Sarı Gelin";
    }
}
