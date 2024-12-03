import org.w3c.dom.ls.LSOutput;

public class Calistir {
    public static void main(String[] args) {
        int sayi = topla();
        System.out.println(sayi);
    }
    // static olan metod ve değişkenler sınıfın hafızaya yüklendiği yerde oluşturulur.
    // Bunlara erişmek için instance oluşturmak gerekmez.
    static int topla() {
        return 4;
    }
}
