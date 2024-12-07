package tr.com.ornek;

public class Main3 {
    public static void main(String[] args) {
        try {
            int sonuc = deneme(-3);
            System.out.println("sonuc:"+sonuc);
        } catch (NegatifException e) {
            System.out.println(e.getAdi());
            System.out.println(e.getMessage());
        }
    }
    private static int deneme(int sayi) {
        if (sayi < 0) {
            // sayının en az 10 olması gerekir.
            NegatifException ex =  new NegatifException("Parametre negatif gönderdildi", "deneme metodu");
            throw ex;
        }
        return sayi * 10;
    }

}
